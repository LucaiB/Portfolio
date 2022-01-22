import java.lang.Thread;

public class BlockchainDriver {

   public static void main(String args[]) {
   	
      BlockChain tcpCoin = new BlockChain();
   	
      Block a = new Block("v1", new java.util.Date(), "5");
      Block b = new Block("v2", new java.util.Date(), "8");
      Block c = new Block("v3", new java.util.Date(), "9");
      Block d = new Block("v4", new java.util.Date(), "89");
   	
      tcpCoin.addBlock(a);
      tcpCoin.addBlock(b);
      tcpCoin.addBlock(c);
   	
   	
   	
      tcpCoin.addBlock(d);
      tcpCoin.getLatestBlock().setPreviousHash("ABCDEFG");
   	//System.out.println(tcpCoin.Block.getData());
      tcpCoin.displayChain();
   	
      tcpCoin.isValid();
   	
      try{
         Thread.sleep(2000);  //  delays program
      }
      catch(Exception e)
      {
       
      }
      BlockChain chain = new BlockChain();
      Block e = new Block("v1", new java.util.Date(), "5");
      chain.displayChain();
   	
   }
	
}
