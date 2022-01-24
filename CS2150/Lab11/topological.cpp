#include <iostream>
#include <fstream>
#include <string>
#include <list>
#include <vector>
#include <queue>
#include <unordered_set>
#include <unordered_map>
#include<algorithm>
#include <map>
#include <stack>


using namespace std;

unordered_map<string, vector<string>> makeGraph(vector<pair<string, string>> edges){
    unordered_map<string, vector<string>> graph;

    for(auto p : edges){
        graph[p.first].push_back(p.second);
    }
    return graph;
}

/*
bool helpTopological(unordered_map<string, vector<string>>& graph, unordered_map<string, int>& visited, string node, vector<string>& result){

    if(visited[node] == 1) return false;
    if(visited[node] == 2) return true;

    // Mark current node as being visited.
    visited[node] = 1;
    // node might not have outgoing edges and therefore not in the
    // unordered_map (graph) as a key.
    
    for(auto neighbor : graph[node]){
        if(!helpTopological(graph, visited, neighbor, result)) return false;
    }
*//*

    result.push_back(node);
    visited[node] = 1;
    return true;
}

void topologicalSort(unordered_map<string, vector<string>>& graph){

    unordered_map<string, int> visited;
    vector<string> result;

    // Should visit all nodes with outgoing edges in the graph.
    for(auto &elem : graph){
        string node = elem.first;
        bool acyclic = helpTopological(graph, visited, node, result);
        if(!acyclic){
            cout << "cycle detected\n";
	    //      return vector<string>{};
        }

    }

    reverse(result.begin(), result.end());
    
    for(string s: result)
      cout << s << " ";

    cout << endl;
}
*/

void topologicalSort(unordered_map<string, vector<string>>& graph){
 
}



int main (int argc, char** argv) {

  // verify the correct number of parameters
  if (argc != 2) {
    cout << "Must supply the input file name as the only parameter" << endl;
    exit(1);
  }
  
  ifstream file(argv[1], ifstream::binary);
  // report any problems opening the file and then exit
  if (!file.is_open()) {
    cout << "Unable to open file '" << argv[1] << "'." << endl;
    exit(2);
  }
  
  //  unordered_map <string, vector<string>> courseMap;
  vector<pair<string, string>> pairs;
  
  while(true){
    string temp1, temp2;
    
    file >> temp1;
    file >> temp2;

    if(temp1 == "0" && temp2 == "0")
      break;
    
    pairs.push_back(make_pair(temp1, temp2));
  }

  auto courseMap = makeGraph(pairs);
  map<string, int> indegree;
  
  for(auto &p: courseMap){
    if(indegree.find(p.first) == indegree.end()){
      indegree[p.first] = 0;
    }
    
    for(auto v: p.second){
      if(indegree.find(v) == indegree.end()){
	indegree[v] = 0;
      }
    }
  }
  
  for(auto &p: courseMap){   
    for(auto v: p.second){
      if(indegree.find(v) != indegree.end()){
	indegree[v]++;
      }
    }
  }

  queue<string> S;
  vector<string> z;
  string result;
  for(auto x: indegree){
    if(x.second == 0)
      S.push(x.first);
  }

  while(!S.empty()){
    string str = S.front();
    S.pop();
    z.push_back(str);

    for(auto elem: courseMap){
      if(elem.first == str){
	for(auto ind: elem.second){
	  if(--indegree[ind] == 0){
	    S.push(ind);
	  }
	}
      }
    }
  }

  /*
  for(auto c: indegree){
    cout << c.first << " " << c.second << endl;
    }*/

  for(auto res: z)
    cout << res << " ";

  cout << endl;
      
  
  
  
  topologicalSort(courseMap);

  //  file.clear(); // Clears the _state_ of the file, not its contents!
  //  file.seekg(0);

  
  file.close();
  
  
  
  return 0;
}
