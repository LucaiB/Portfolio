
bomb:     file format elf64-x86-64


Disassembly of section .init:

0000000000002000 <_init>:
    2000:	f3 0f 1e fa          	endbr64 
    2004:	48 83 ec 08          	sub    $0x8,%rsp
    2008:	48 8b 05 d9 4f 00 00 	mov    0x4fd9(%rip),%rax        # 6fe8 <__gmon_start__>
    200f:	48 85 c0             	test   %rax,%rax
    2012:	74 02                	je     2016 <_init+0x16>
    2014:	ff d0                	callq  *%rax
    2016:	48 83 c4 08          	add    $0x8,%rsp
    201a:	c3                   	retq   

Disassembly of section .plt:

0000000000002020 <.plt>:
    2020:	ff 35 ca 4e 00 00    	pushq  0x4eca(%rip)        # 6ef0 <_GLOBAL_OFFSET_TABLE_+0x8>
    2026:	f2 ff 25 cb 4e 00 00 	bnd jmpq *0x4ecb(%rip)        # 6ef8 <_GLOBAL_OFFSET_TABLE_+0x10>
    202d:	0f 1f 00             	nopl   (%rax)
    2030:	f3 0f 1e fa          	endbr64 
    2034:	68 00 00 00 00       	pushq  $0x0
    2039:	f2 e9 e1 ff ff ff    	bnd jmpq 2020 <.plt>
    203f:	90                   	nop
    2040:	f3 0f 1e fa          	endbr64 
    2044:	68 01 00 00 00       	pushq  $0x1
    2049:	f2 e9 d1 ff ff ff    	bnd jmpq 2020 <.plt>
    204f:	90                   	nop
    2050:	f3 0f 1e fa          	endbr64 
    2054:	68 02 00 00 00       	pushq  $0x2
    2059:	f2 e9 c1 ff ff ff    	bnd jmpq 2020 <.plt>
    205f:	90                   	nop
    2060:	f3 0f 1e fa          	endbr64 
    2064:	68 03 00 00 00       	pushq  $0x3
    2069:	f2 e9 b1 ff ff ff    	bnd jmpq 2020 <.plt>
    206f:	90                   	nop
    2070:	f3 0f 1e fa          	endbr64 
    2074:	68 04 00 00 00       	pushq  $0x4
    2079:	f2 e9 a1 ff ff ff    	bnd jmpq 2020 <.plt>
    207f:	90                   	nop
    2080:	f3 0f 1e fa          	endbr64 
    2084:	68 05 00 00 00       	pushq  $0x5
    2089:	f2 e9 91 ff ff ff    	bnd jmpq 2020 <.plt>
    208f:	90                   	nop
    2090:	f3 0f 1e fa          	endbr64 
    2094:	68 06 00 00 00       	pushq  $0x6
    2099:	f2 e9 81 ff ff ff    	bnd jmpq 2020 <.plt>
    209f:	90                   	nop
    20a0:	f3 0f 1e fa          	endbr64 
    20a4:	68 07 00 00 00       	pushq  $0x7
    20a9:	f2 e9 71 ff ff ff    	bnd jmpq 2020 <.plt>
    20af:	90                   	nop
    20b0:	f3 0f 1e fa          	endbr64 
    20b4:	68 08 00 00 00       	pushq  $0x8
    20b9:	f2 e9 61 ff ff ff    	bnd jmpq 2020 <.plt>
    20bf:	90                   	nop
    20c0:	f3 0f 1e fa          	endbr64 
    20c4:	68 09 00 00 00       	pushq  $0x9
    20c9:	f2 e9 51 ff ff ff    	bnd jmpq 2020 <.plt>
    20cf:	90                   	nop
    20d0:	f3 0f 1e fa          	endbr64 
    20d4:	68 0a 00 00 00       	pushq  $0xa
    20d9:	f2 e9 41 ff ff ff    	bnd jmpq 2020 <.plt>
    20df:	90                   	nop
    20e0:	f3 0f 1e fa          	endbr64 
    20e4:	68 0b 00 00 00       	pushq  $0xb
    20e9:	f2 e9 31 ff ff ff    	bnd jmpq 2020 <.plt>
    20ef:	90                   	nop
    20f0:	f3 0f 1e fa          	endbr64 
    20f4:	68 0c 00 00 00       	pushq  $0xc
    20f9:	f2 e9 21 ff ff ff    	bnd jmpq 2020 <.plt>
    20ff:	90                   	nop
    2100:	f3 0f 1e fa          	endbr64 
    2104:	68 0d 00 00 00       	pushq  $0xd
    2109:	f2 e9 11 ff ff ff    	bnd jmpq 2020 <.plt>
    210f:	90                   	nop
    2110:	f3 0f 1e fa          	endbr64 
    2114:	68 0e 00 00 00       	pushq  $0xe
    2119:	f2 e9 01 ff ff ff    	bnd jmpq 2020 <.plt>
    211f:	90                   	nop
    2120:	f3 0f 1e fa          	endbr64 
    2124:	68 0f 00 00 00       	pushq  $0xf
    2129:	f2 e9 f1 fe ff ff    	bnd jmpq 2020 <.plt>
    212f:	90                   	nop
    2130:	f3 0f 1e fa          	endbr64 
    2134:	68 10 00 00 00       	pushq  $0x10
    2139:	f2 e9 e1 fe ff ff    	bnd jmpq 2020 <.plt>
    213f:	90                   	nop
    2140:	f3 0f 1e fa          	endbr64 
    2144:	68 11 00 00 00       	pushq  $0x11
    2149:	f2 e9 d1 fe ff ff    	bnd jmpq 2020 <.plt>
    214f:	90                   	nop
    2150:	f3 0f 1e fa          	endbr64 
    2154:	68 12 00 00 00       	pushq  $0x12
    2159:	f2 e9 c1 fe ff ff    	bnd jmpq 2020 <.plt>
    215f:	90                   	nop
    2160:	f3 0f 1e fa          	endbr64 
    2164:	68 13 00 00 00       	pushq  $0x13
    2169:	f2 e9 b1 fe ff ff    	bnd jmpq 2020 <.plt>
    216f:	90                   	nop
    2170:	f3 0f 1e fa          	endbr64 
    2174:	68 14 00 00 00       	pushq  $0x14
    2179:	f2 e9 a1 fe ff ff    	bnd jmpq 2020 <.plt>
    217f:	90                   	nop
    2180:	f3 0f 1e fa          	endbr64 
    2184:	68 15 00 00 00       	pushq  $0x15
    2189:	f2 e9 91 fe ff ff    	bnd jmpq 2020 <.plt>
    218f:	90                   	nop
    2190:	f3 0f 1e fa          	endbr64 
    2194:	68 16 00 00 00       	pushq  $0x16
    2199:	f2 e9 81 fe ff ff    	bnd jmpq 2020 <.plt>
    219f:	90                   	nop
    21a0:	f3 0f 1e fa          	endbr64 
    21a4:	68 17 00 00 00       	pushq  $0x17
    21a9:	f2 e9 71 fe ff ff    	bnd jmpq 2020 <.plt>
    21af:	90                   	nop
    21b0:	f3 0f 1e fa          	endbr64 
    21b4:	68 18 00 00 00       	pushq  $0x18
    21b9:	f2 e9 61 fe ff ff    	bnd jmpq 2020 <.plt>
    21bf:	90                   	nop
    21c0:	f3 0f 1e fa          	endbr64 
    21c4:	68 19 00 00 00       	pushq  $0x19
    21c9:	f2 e9 51 fe ff ff    	bnd jmpq 2020 <.plt>
    21cf:	90                   	nop
    21d0:	f3 0f 1e fa          	endbr64 
    21d4:	68 1a 00 00 00       	pushq  $0x1a
    21d9:	f2 e9 41 fe ff ff    	bnd jmpq 2020 <.plt>
    21df:	90                   	nop

Disassembly of section .plt.got:

00000000000021e0 <__cxa_finalize@plt>:
    21e0:	f3 0f 1e fa          	endbr64 
    21e4:	f2 ff 25 0d 4e 00 00 	bnd jmpq *0x4e0d(%rip)        # 6ff8 <__cxa_finalize@GLIBC_2.2.5>
    21eb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

Disassembly of section .plt.sec:

00000000000021f0 <getenv@plt>:
    21f0:	f3 0f 1e fa          	endbr64 
    21f4:	f2 ff 25 05 4d 00 00 	bnd jmpq *0x4d05(%rip)        # 6f00 <getenv@GLIBC_2.2.5>
    21fb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002200 <strcasecmp@plt>:
    2200:	f3 0f 1e fa          	endbr64 
    2204:	f2 ff 25 fd 4c 00 00 	bnd jmpq *0x4cfd(%rip)        # 6f08 <strcasecmp@GLIBC_2.2.5>
    220b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002210 <__errno_location@plt>:
    2210:	f3 0f 1e fa          	endbr64 
    2214:	f2 ff 25 f5 4c 00 00 	bnd jmpq *0x4cf5(%rip)        # 6f10 <__errno_location@GLIBC_2.2.5>
    221b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002220 <strcpy@plt>:
    2220:	f3 0f 1e fa          	endbr64 
    2224:	f2 ff 25 ed 4c 00 00 	bnd jmpq *0x4ced(%rip)        # 6f18 <strcpy@GLIBC_2.2.5>
    222b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002230 <puts@plt>:
    2230:	f3 0f 1e fa          	endbr64 
    2234:	f2 ff 25 e5 4c 00 00 	bnd jmpq *0x4ce5(%rip)        # 6f20 <puts@GLIBC_2.2.5>
    223b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002240 <write@plt>:
    2240:	f3 0f 1e fa          	endbr64 
    2244:	f2 ff 25 dd 4c 00 00 	bnd jmpq *0x4cdd(%rip)        # 6f28 <write@GLIBC_2.2.5>
    224b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002250 <__stack_chk_fail@plt>:
    2250:	f3 0f 1e fa          	endbr64 
    2254:	f2 ff 25 d5 4c 00 00 	bnd jmpq *0x4cd5(%rip)        # 6f30 <__stack_chk_fail@GLIBC_2.4>
    225b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002260 <alarm@plt>:
    2260:	f3 0f 1e fa          	endbr64 
    2264:	f2 ff 25 cd 4c 00 00 	bnd jmpq *0x4ccd(%rip)        # 6f38 <alarm@GLIBC_2.2.5>
    226b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002270 <close@plt>:
    2270:	f3 0f 1e fa          	endbr64 
    2274:	f2 ff 25 c5 4c 00 00 	bnd jmpq *0x4cc5(%rip)        # 6f40 <close@GLIBC_2.2.5>
    227b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002280 <read@plt>:
    2280:	f3 0f 1e fa          	endbr64 
    2284:	f2 ff 25 bd 4c 00 00 	bnd jmpq *0x4cbd(%rip)        # 6f48 <read@GLIBC_2.2.5>
    228b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002290 <fgets@plt>:
    2290:	f3 0f 1e fa          	endbr64 
    2294:	f2 ff 25 b5 4c 00 00 	bnd jmpq *0x4cb5(%rip)        # 6f50 <fgets@GLIBC_2.2.5>
    229b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000022a0 <signal@plt>:
    22a0:	f3 0f 1e fa          	endbr64 
    22a4:	f2 ff 25 ad 4c 00 00 	bnd jmpq *0x4cad(%rip)        # 6f58 <signal@GLIBC_2.2.5>
    22ab:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000022b0 <gethostbyname@plt>:
    22b0:	f3 0f 1e fa          	endbr64 
    22b4:	f2 ff 25 a5 4c 00 00 	bnd jmpq *0x4ca5(%rip)        # 6f60 <gethostbyname@GLIBC_2.2.5>
    22bb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000022c0 <__memmove_chk@plt>:
    22c0:	f3 0f 1e fa          	endbr64 
    22c4:	f2 ff 25 9d 4c 00 00 	bnd jmpq *0x4c9d(%rip)        # 6f68 <__memmove_chk@GLIBC_2.3.4>
    22cb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000022d0 <strtol@plt>:
    22d0:	f3 0f 1e fa          	endbr64 
    22d4:	f2 ff 25 95 4c 00 00 	bnd jmpq *0x4c95(%rip)        # 6f70 <strtol@GLIBC_2.2.5>
    22db:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000022e0 <fflush@plt>:
    22e0:	f3 0f 1e fa          	endbr64 
    22e4:	f2 ff 25 8d 4c 00 00 	bnd jmpq *0x4c8d(%rip)        # 6f78 <fflush@GLIBC_2.2.5>
    22eb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000022f0 <__isoc99_sscanf@plt>:
    22f0:	f3 0f 1e fa          	endbr64 
    22f4:	f2 ff 25 85 4c 00 00 	bnd jmpq *0x4c85(%rip)        # 6f80 <__isoc99_sscanf@GLIBC_2.7>
    22fb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002300 <__printf_chk@plt>:
    2300:	f3 0f 1e fa          	endbr64 
    2304:	f2 ff 25 7d 4c 00 00 	bnd jmpq *0x4c7d(%rip)        # 6f88 <__printf_chk@GLIBC_2.3.4>
    230b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002310 <fopen@plt>:
    2310:	f3 0f 1e fa          	endbr64 
    2314:	f2 ff 25 75 4c 00 00 	bnd jmpq *0x4c75(%rip)        # 6f90 <fopen@GLIBC_2.2.5>
    231b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002320 <gethostname@plt>:
    2320:	f3 0f 1e fa          	endbr64 
    2324:	f2 ff 25 6d 4c 00 00 	bnd jmpq *0x4c6d(%rip)        # 6f98 <gethostname@GLIBC_2.2.5>
    232b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002330 <exit@plt>:
    2330:	f3 0f 1e fa          	endbr64 
    2334:	f2 ff 25 65 4c 00 00 	bnd jmpq *0x4c65(%rip)        # 6fa0 <exit@GLIBC_2.2.5>
    233b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002340 <connect@plt>:
    2340:	f3 0f 1e fa          	endbr64 
    2344:	f2 ff 25 5d 4c 00 00 	bnd jmpq *0x4c5d(%rip)        # 6fa8 <connect@GLIBC_2.2.5>
    234b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002350 <__fprintf_chk@plt>:
    2350:	f3 0f 1e fa          	endbr64 
    2354:	f2 ff 25 55 4c 00 00 	bnd jmpq *0x4c55(%rip)        # 6fb0 <__fprintf_chk@GLIBC_2.3.4>
    235b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002360 <sleep@plt>:
    2360:	f3 0f 1e fa          	endbr64 
    2364:	f2 ff 25 4d 4c 00 00 	bnd jmpq *0x4c4d(%rip)        # 6fb8 <sleep@GLIBC_2.2.5>
    236b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002370 <__ctype_b_loc@plt>:
    2370:	f3 0f 1e fa          	endbr64 
    2374:	f2 ff 25 45 4c 00 00 	bnd jmpq *0x4c45(%rip)        # 6fc0 <__ctype_b_loc@GLIBC_2.3>
    237b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002380 <__sprintf_chk@plt>:
    2380:	f3 0f 1e fa          	endbr64 
    2384:	f2 ff 25 3d 4c 00 00 	bnd jmpq *0x4c3d(%rip)        # 6fc8 <__sprintf_chk@GLIBC_2.3.4>
    238b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000002390 <socket@plt>:
    2390:	f3 0f 1e fa          	endbr64 
    2394:	f2 ff 25 35 4c 00 00 	bnd jmpq *0x4c35(%rip)        # 6fd0 <socket@GLIBC_2.2.5>
    239b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

Disassembly of section .text:

00000000000023a0 <_start>:
    23a0:	f3 0f 1e fa          	endbr64 
    23a4:	31 ed                	xor    %ebp,%ebp
    23a6:	49 89 d1             	mov    %rdx,%r9
    23a9:	5e                   	pop    %rsi
    23aa:	48 89 e2             	mov    %rsp,%rdx
    23ad:	48 83 e4 f0          	and    $0xfffffffffffffff0,%rsp
    23b1:	50                   	push   %rax
    23b2:	54                   	push   %rsp
    23b3:	4c 8d 05 56 19 00 00 	lea    0x1956(%rip),%r8        # 3d10 <__libc_csu_fini>
    23ba:	48 8d 0d df 18 00 00 	lea    0x18df(%rip),%rcx        # 3ca0 <__libc_csu_init>
    23c1:	48 8d 3d c1 00 00 00 	lea    0xc1(%rip),%rdi        # 2489 <main>
    23c8:	ff 15 12 4c 00 00    	callq  *0x4c12(%rip)        # 6fe0 <__libc_start_main@GLIBC_2.2.5>
    23ce:	f4                   	hlt    
    23cf:	90                   	nop

00000000000023d0 <deregister_tm_clones>:
    23d0:	48 8d 3d a9 56 00 00 	lea    0x56a9(%rip),%rdi        # 7a80 <stdout@@GLIBC_2.2.5>
    23d7:	48 8d 05 a2 56 00 00 	lea    0x56a2(%rip),%rax        # 7a80 <stdout@@GLIBC_2.2.5>
    23de:	48 39 f8             	cmp    %rdi,%rax
    23e1:	74 15                	je     23f8 <deregister_tm_clones+0x28>
    23e3:	48 8b 05 ee 4b 00 00 	mov    0x4bee(%rip),%rax        # 6fd8 <_ITM_deregisterTMCloneTable>
    23ea:	48 85 c0             	test   %rax,%rax
    23ed:	74 09                	je     23f8 <deregister_tm_clones+0x28>
    23ef:	ff e0                	jmpq   *%rax
    23f1:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)
    23f8:	c3                   	retq   
    23f9:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)

0000000000002400 <register_tm_clones>:
    2400:	48 8d 3d 79 56 00 00 	lea    0x5679(%rip),%rdi        # 7a80 <stdout@@GLIBC_2.2.5>
    2407:	48 8d 35 72 56 00 00 	lea    0x5672(%rip),%rsi        # 7a80 <stdout@@GLIBC_2.2.5>
    240e:	48 29 fe             	sub    %rdi,%rsi
    2411:	48 89 f0             	mov    %rsi,%rax
    2414:	48 c1 ee 3f          	shr    $0x3f,%rsi
    2418:	48 c1 f8 03          	sar    $0x3,%rax
    241c:	48 01 c6             	add    %rax,%rsi
    241f:	48 d1 fe             	sar    %rsi
    2422:	74 14                	je     2438 <register_tm_clones+0x38>
    2424:	48 8b 05 c5 4b 00 00 	mov    0x4bc5(%rip),%rax        # 6ff0 <_ITM_registerTMCloneTable>
    242b:	48 85 c0             	test   %rax,%rax
    242e:	74 08                	je     2438 <register_tm_clones+0x38>
    2430:	ff e0                	jmpq   *%rax
    2432:	66 0f 1f 44 00 00    	nopw   0x0(%rax,%rax,1)
    2438:	c3                   	retq   
    2439:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)

0000000000002440 <__do_global_dtors_aux>:
    2440:	f3 0f 1e fa          	endbr64 
    2444:	80 3d 5d 56 00 00 00 	cmpb   $0x0,0x565d(%rip)        # 7aa8 <completed.8060>
    244b:	75 2b                	jne    2478 <__do_global_dtors_aux+0x38>
    244d:	55                   	push   %rbp
    244e:	48 83 3d a2 4b 00 00 	cmpq   $0x0,0x4ba2(%rip)        # 6ff8 <__cxa_finalize@GLIBC_2.2.5>
    2455:	00 
    2456:	48 89 e5             	mov    %rsp,%rbp
    2459:	74 0c                	je     2467 <__do_global_dtors_aux+0x27>
    245b:	48 8b 3d a6 4b 00 00 	mov    0x4ba6(%rip),%rdi        # 7008 <__dso_handle>
    2462:	e8 79 fd ff ff       	callq  21e0 <__cxa_finalize@plt>
    2467:	e8 64 ff ff ff       	callq  23d0 <deregister_tm_clones>
    246c:	c6 05 35 56 00 00 01 	movb   $0x1,0x5635(%rip)        # 7aa8 <completed.8060>
    2473:	5d                   	pop    %rbp
    2474:	c3                   	retq   
    2475:	0f 1f 00             	nopl   (%rax)
    2478:	c3                   	retq   
    2479:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)

0000000000002480 <frame_dummy>:
    2480:	f3 0f 1e fa          	endbr64 
    2484:	e9 77 ff ff ff       	jmpq   2400 <register_tm_clones>

0000000000002489 <main>:
    2489:	f3 0f 1e fa          	endbr64 
    248d:	53                   	push   %rbx
    248e:	83 ff 01             	cmp    $0x1,%edi
    2491:	0f 84 f8 00 00 00    	je     258f <main+0x106>
    2497:	48 89 f3             	mov    %rsi,%rbx
    249a:	83 ff 02             	cmp    $0x2,%edi
    249d:	0f 85 21 01 00 00    	jne    25c4 <main+0x13b>
    24a3:	48 8b 7e 08          	mov    0x8(%rsi),%rdi
    24a7:	48 8d 35 56 1b 00 00 	lea    0x1b56(%rip),%rsi        # 4004 <_IO_stdin_used+0x4>
    24ae:	e8 5d fe ff ff       	callq  2310 <fopen@plt>
    24b3:	48 89 05 f6 55 00 00 	mov    %rax,0x55f6(%rip)        # 7ab0 <infile>
    24ba:	48 85 c0             	test   %rax,%rax
    24bd:	0f 84 df 00 00 00    	je     25a2 <main+0x119>
    24c3:	e8 03 07 00 00       	callq  2bcb <initialize_bomb>
    24c8:	48 8d 3d b9 1b 00 00 	lea    0x1bb9(%rip),%rdi        # 4088 <_IO_stdin_used+0x88>
    24cf:	e8 5c fd ff ff       	callq  2230 <puts@plt>
    24d4:	48 8d 3d ed 1b 00 00 	lea    0x1bed(%rip),%rdi        # 40c8 <_IO_stdin_used+0xc8>
    24db:	e8 50 fd ff ff       	callq  2230 <puts@plt>
    24e0:	e8 e0 09 00 00       	callq  2ec5 <read_line>
    24e5:	48 89 c7             	mov    %rax,%rdi
    24e8:	e8 fa 00 00 00       	callq  25e7 <phase_1>
    24ed:	e8 1b 0b 00 00       	callq  300d <phase_defused>
    24f2:	48 8d 3d ff 1b 00 00 	lea    0x1bff(%rip),%rdi        # 40f8 <_IO_stdin_used+0xf8>
    24f9:	e8 32 fd ff ff       	callq  2230 <puts@plt>
    24fe:	e8 c2 09 00 00       	callq  2ec5 <read_line>
    2503:	48 89 c7             	mov    %rax,%rdi
    2506:	e8 00 01 00 00       	callq  260b <phase_2>
    250b:	e8 fd 0a 00 00       	callq  300d <phase_defused>
    2510:	48 8d 3d 26 1b 00 00 	lea    0x1b26(%rip),%rdi        # 403d <_IO_stdin_used+0x3d>
    2517:	e8 14 fd ff ff       	callq  2230 <puts@plt>
    251c:	e8 a4 09 00 00       	callq  2ec5 <read_line>
    2521:	48 89 c7             	mov    %rax,%rdi
    2524:	e8 50 01 00 00       	callq  2679 <phase_3>
    2529:	e8 df 0a 00 00       	callq  300d <phase_defused>
    252e:	48 8d 3d 26 1b 00 00 	lea    0x1b26(%rip),%rdi        # 405b <_IO_stdin_used+0x5b>
    2535:	e8 f6 fc ff ff       	callq  2230 <puts@plt>
    253a:	e8 86 09 00 00       	callq  2ec5 <read_line>
    253f:	48 89 c7             	mov    %rax,%rdi
    2542:	e8 e9 02 00 00       	callq  2830 <phase_4>
    2547:	e8 c1 0a 00 00       	callq  300d <phase_defused>
    254c:	48 8d 3d d5 1b 00 00 	lea    0x1bd5(%rip),%rdi        # 4128 <_IO_stdin_used+0x128>
    2553:	e8 d8 fc ff ff       	callq  2230 <puts@plt>
    2558:	e8 68 09 00 00       	callq  2ec5 <read_line>
    255d:	48 89 c7             	mov    %rax,%rdi
    2560:	e8 44 03 00 00       	callq  28a9 <phase_5>
    2565:	e8 a3 0a 00 00       	callq  300d <phase_defused>
    256a:	48 8d 3d f9 1a 00 00 	lea    0x1af9(%rip),%rdi        # 406a <_IO_stdin_used+0x6a>
    2571:	e8 ba fc ff ff       	callq  2230 <puts@plt>
    2576:	e8 4a 09 00 00       	callq  2ec5 <read_line>
    257b:	48 89 c7             	mov    %rax,%rdi
    257e:	e8 72 03 00 00       	callq  28f5 <phase_6>
    2583:	e8 85 0a 00 00       	callq  300d <phase_defused>
    2588:	b8 00 00 00 00       	mov    $0x0,%eax
    258d:	5b                   	pop    %rbx
    258e:	c3                   	retq   
    258f:	48 8b 05 fa 54 00 00 	mov    0x54fa(%rip),%rax        # 7a90 <stdin@@GLIBC_2.2.5>
    2596:	48 89 05 13 55 00 00 	mov    %rax,0x5513(%rip)        # 7ab0 <infile>
    259d:	e9 21 ff ff ff       	jmpq   24c3 <main+0x3a>
    25a2:	48 8b 4b 08          	mov    0x8(%rbx),%rcx
    25a6:	48 8b 13             	mov    (%rbx),%rdx
    25a9:	48 8d 35 56 1a 00 00 	lea    0x1a56(%rip),%rsi        # 4006 <_IO_stdin_used+0x6>
    25b0:	bf 01 00 00 00       	mov    $0x1,%edi
    25b5:	e8 46 fd ff ff       	callq  2300 <__printf_chk@plt>
    25ba:	bf 08 00 00 00       	mov    $0x8,%edi
    25bf:	e8 6c fd ff ff       	callq  2330 <exit@plt>
    25c4:	48 8b 16             	mov    (%rsi),%rdx
    25c7:	48 8d 35 55 1a 00 00 	lea    0x1a55(%rip),%rsi        # 4023 <_IO_stdin_used+0x23>
    25ce:	bf 01 00 00 00       	mov    $0x1,%edi
    25d3:	b8 00 00 00 00       	mov    $0x0,%eax
    25d8:	e8 23 fd ff ff       	callq  2300 <__printf_chk@plt>
    25dd:	bf 08 00 00 00       	mov    $0x8,%edi
    25e2:	e8 49 fd ff ff       	callq  2330 <exit@plt>

00000000000025e7 <phase_1>:
    25e7:	f3 0f 1e fa          	endbr64 
    25eb:	48 83 ec 08          	sub    $0x8,%rsp
    25ef:	48 8d 35 5a 1b 00 00 	lea    0x1b5a(%rip),%rsi        # 4150 <_IO_stdin_used+0x150>
    25f6:	e8 70 05 00 00       	callq  2b6b <strings_not_equal>
    25fb:	85 c0                	test   %eax,%eax
    25fd:	75 05                	jne    2604 <phase_1+0x1d>
    25ff:	48 83 c4 08          	add    $0x8,%rsp
    2603:	c3                   	retq   
    2604:	e8 35 08 00 00       	callq  2e3e <explode_bomb>
    2609:	eb f4                	jmp    25ff <phase_1+0x18>

000000000000260b <phase_2>:
    260b:	f3 0f 1e fa          	endbr64 
    260f:	55                   	push   %rbp
    2610:	53                   	push   %rbx
    2611:	48 83 ec 28          	sub    $0x28,%rsp
    2615:	64 48 8b 04 25 28 00 	mov    %fs:0x28,%rax
    261c:	00 00 
    261e:	48 89 44 24 18       	mov    %rax,0x18(%rsp)
    2623:	31 c0                	xor    %eax,%eax
    2625:	48 89 e6             	mov    %rsp,%rsi
    2628:	e8 53 08 00 00       	callq  2e80 <read_six_numbers>
    262d:	83 3c 24 03          	cmpl   $0x3,(%rsp)
    2631:	75 0a                	jne    263d <phase_2+0x32>
    2633:	48 89 e3             	mov    %rsp,%rbx
    2636:	48 8d 6c 24 14       	lea    0x14(%rsp),%rbp
    263b:	eb 15                	jmp    2652 <phase_2+0x47>
    263d:	e8 fc 07 00 00       	callq  2e3e <explode_bomb>
    2642:	eb ef                	jmp    2633 <phase_2+0x28>
    2644:	e8 f5 07 00 00       	callq  2e3e <explode_bomb>
    2649:	48 83 c3 04          	add    $0x4,%rbx
    264d:	48 39 eb             	cmp    %rbp,%rbx
    2650:	74 0b                	je     265d <phase_2+0x52>
    2652:	8b 03                	mov    (%rbx),%eax
    2654:	01 c0                	add    %eax,%eax
    2656:	39 43 04             	cmp    %eax,0x4(%rbx)
    2659:	74 ee                	je     2649 <phase_2+0x3e>
    265b:	eb e7                	jmp    2644 <phase_2+0x39>
    265d:	48 8b 44 24 18       	mov    0x18(%rsp),%rax
    2662:	64 48 33 04 25 28 00 	xor    %fs:0x28,%rax
    2669:	00 00 
    266b:	75 07                	jne    2674 <phase_2+0x69>
    266d:	48 83 c4 28          	add    $0x28,%rsp
    2671:	5b                   	pop    %rbx
    2672:	5d                   	pop    %rbp
    2673:	c3                   	retq   
    2674:	e8 d7 fb ff ff       	callq  2250 <__stack_chk_fail@plt>

0000000000002679 <phase_3>:
    2679:	f3 0f 1e fa          	endbr64 
    267d:	48 83 ec 28          	sub    $0x28,%rsp
    2681:	64 48 8b 04 25 28 00 	mov    %fs:0x28,%rax
    2688:	00 00 
    268a:	48 89 44 24 18       	mov    %rax,0x18(%rsp)
    268f:	31 c0                	xor    %eax,%eax
    2691:	48 8d 4c 24 10       	lea    0x10(%rsp),%rcx
    2696:	48 8d 54 24 0f       	lea    0xf(%rsp),%rdx
    269b:	4c 8d 44 24 14       	lea    0x14(%rsp),%r8
    26a0:	48 8d 35 07 1b 00 00 	lea    0x1b07(%rip),%rsi        # 41ae <_IO_stdin_used+0x1ae>
    26a7:	e8 44 fc ff ff       	callq  22f0 <__isoc99_sscanf@plt>
    26ac:	83 f8 02             	cmp    $0x2,%eax
    26af:	7e 20                	jle    26d1 <phase_3+0x58>
    26b1:	83 7c 24 10 07       	cmpl   $0x7,0x10(%rsp)
    26b6:	0f 87 0d 01 00 00    	ja     27c9 <phase_3+0x150>
    26bc:	8b 44 24 10          	mov    0x10(%rsp),%eax
    26c0:	48 8d 15 f9 1a 00 00 	lea    0x1af9(%rip),%rdx        # 41c0 <_IO_stdin_used+0x1c0>
    26c7:	48 63 04 82          	movslq (%rdx,%rax,4),%rax
    26cb:	48 01 d0             	add    %rdx,%rax
    26ce:	3e ff e0             	notrack jmpq *%rax
    26d1:	e8 68 07 00 00       	callq  2e3e <explode_bomb>
    26d6:	eb d9                	jmp    26b1 <phase_3+0x38>
    26d8:	b8 6c 00 00 00       	mov    $0x6c,%eax
    26dd:	81 7c 24 14 e7 00 00 	cmpl   $0xe7,0x14(%rsp)
    26e4:	00 
    26e5:	0f 84 e8 00 00 00    	je     27d3 <phase_3+0x15a>
    26eb:	e8 4e 07 00 00       	callq  2e3e <explode_bomb>
    26f0:	b8 6c 00 00 00       	mov    $0x6c,%eax
    26f5:	e9 d9 00 00 00       	jmpq   27d3 <phase_3+0x15a>
    26fa:	b8 6e 00 00 00       	mov    $0x6e,%eax
    26ff:	81 7c 24 14 89 03 00 	cmpl   $0x389,0x14(%rsp)
    2706:	00 
    2707:	0f 84 c6 00 00 00    	je     27d3 <phase_3+0x15a>
    270d:	e8 2c 07 00 00       	callq  2e3e <explode_bomb>
    2712:	b8 6e 00 00 00       	mov    $0x6e,%eax
    2717:	e9 b7 00 00 00       	jmpq   27d3 <phase_3+0x15a>
    271c:	b8 61 00 00 00       	mov    $0x61,%eax
    2721:	81 7c 24 14 cb 00 00 	cmpl   $0xcb,0x14(%rsp)
    2728:	00 
    2729:	0f 84 a4 00 00 00    	je     27d3 <phase_3+0x15a>
    272f:	e8 0a 07 00 00       	callq  2e3e <explode_bomb>
    2734:	b8 61 00 00 00       	mov    $0x61,%eax
    2739:	e9 95 00 00 00       	jmpq   27d3 <phase_3+0x15a>
    273e:	b8 79 00 00 00       	mov    $0x79,%eax
    2743:	81 7c 24 14 49 02 00 	cmpl   $0x249,0x14(%rsp)
    274a:	00 
    274b:	0f 84 82 00 00 00    	je     27d3 <phase_3+0x15a>
    2751:	e8 e8 06 00 00       	callq  2e3e <explode_bomb>
    2756:	b8 79 00 00 00       	mov    $0x79,%eax
    275b:	eb 76                	jmp    27d3 <phase_3+0x15a>
    275d:	b8 74 00 00 00       	mov    $0x74,%eax
    2762:	81 7c 24 14 50 02 00 	cmpl   $0x250,0x14(%rsp)
    2769:	00 
    276a:	74 67                	je     27d3 <phase_3+0x15a>
    276c:	e8 cd 06 00 00       	callq  2e3e <explode_bomb>
    2771:	b8 74 00 00 00       	mov    $0x74,%eax
    2776:	eb 5b                	jmp    27d3 <phase_3+0x15a>
    2778:	b8 61 00 00 00       	mov    $0x61,%eax
    277d:	81 7c 24 14 c6 02 00 	cmpl   $0x2c6,0x14(%rsp)
    2784:	00 
    2785:	74 4c                	je     27d3 <phase_3+0x15a>
    2787:	e8 b2 06 00 00       	callq  2e3e <explode_bomb>
    278c:	b8 61 00 00 00       	mov    $0x61,%eax
    2791:	eb 40                	jmp    27d3 <phase_3+0x15a>
    2793:	b8 66 00 00 00       	mov    $0x66,%eax
    2798:	81 7c 24 14 e1 03 00 	cmpl   $0x3e1,0x14(%rsp)
    279f:	00 
    27a0:	74 31                	je     27d3 <phase_3+0x15a>
    27a2:	e8 97 06 00 00       	callq  2e3e <explode_bomb>
    27a7:	b8 66 00 00 00       	mov    $0x66,%eax
    27ac:	eb 25                	jmp    27d3 <phase_3+0x15a>
    27ae:	b8 61 00 00 00       	mov    $0x61,%eax
    27b3:	81 7c 24 14 90 02 00 	cmpl   $0x290,0x14(%rsp)
    27ba:	00 
    27bb:	74 16                	je     27d3 <phase_3+0x15a>
    27bd:	e8 7c 06 00 00       	callq  2e3e <explode_bomb>
    27c2:	b8 61 00 00 00       	mov    $0x61,%eax
    27c7:	eb 0a                	jmp    27d3 <phase_3+0x15a>
    27c9:	e8 70 06 00 00       	callq  2e3e <explode_bomb>
    27ce:	b8 71 00 00 00       	mov    $0x71,%eax
    27d3:	38 44 24 0f          	cmp    %al,0xf(%rsp)
    27d7:	75 15                	jne    27ee <phase_3+0x175>
    27d9:	48 8b 44 24 18       	mov    0x18(%rsp),%rax
    27de:	64 48 33 04 25 28 00 	xor    %fs:0x28,%rax
    27e5:	00 00 
    27e7:	75 0c                	jne    27f5 <phase_3+0x17c>
    27e9:	48 83 c4 28          	add    $0x28,%rsp
    27ed:	c3                   	retq   
    27ee:	e8 4b 06 00 00       	callq  2e3e <explode_bomb>
    27f3:	eb e4                	jmp    27d9 <phase_3+0x160>
    27f5:	e8 56 fa ff ff       	callq  2250 <__stack_chk_fail@plt>

00000000000027fa <func4>:
    27fa:	f3 0f 1e fa          	endbr64 
    27fe:	53                   	push   %rbx
    27ff:	89 d0                	mov    %edx,%eax
    2801:	29 f0                	sub    %esi,%eax
    2803:	89 c3                	mov    %eax,%ebx
    2805:	c1 eb 1f             	shr    $0x1f,%ebx
    2808:	01 c3                	add    %eax,%ebx
    280a:	d1 fb                	sar    %ebx
    280c:	01 f3                	add    %esi,%ebx
    280e:	39 fb                	cmp    %edi,%ebx
    2810:	7f 06                	jg     2818 <func4+0x1e>
    2812:	7c 10                	jl     2824 <func4+0x2a>
    2814:	89 d8                	mov    %ebx,%eax
    2816:	5b                   	pop    %rbx
    2817:	c3                   	retq   
    2818:	8d 53 ff             	lea    -0x1(%rbx),%edx
    281b:	e8 da ff ff ff       	callq  27fa <func4>
    2820:	01 c3                	add    %eax,%ebx
    2822:	eb f0                	jmp    2814 <func4+0x1a>
    2824:	8d 73 01             	lea    0x1(%rbx),%esi
    2827:	e8 ce ff ff ff       	callq  27fa <func4>
    282c:	01 c3                	add    %eax,%ebx
    282e:	eb e4                	jmp    2814 <func4+0x1a>

0000000000002830 <phase_4>:
    2830:	f3 0f 1e fa          	endbr64 
    2834:	48 83 ec 18          	sub    $0x18,%rsp
    2838:	64 48 8b 04 25 28 00 	mov    %fs:0x28,%rax
    283f:	00 00 
    2841:	48 89 44 24 08       	mov    %rax,0x8(%rsp)
    2846:	31 c0                	xor    %eax,%eax
    2848:	48 8d 4c 24 04       	lea    0x4(%rsp),%rcx
    284d:	48 89 e2             	mov    %rsp,%rdx
    2850:	48 8d 35 5a 19 00 00 	lea    0x195a(%rip),%rsi        # 41b1 <_IO_stdin_used+0x1b1>
    2857:	e8 94 fa ff ff       	callq  22f0 <__isoc99_sscanf@plt>
    285c:	83 f8 02             	cmp    $0x2,%eax
    285f:	75 06                	jne    2867 <phase_4+0x37>
    2861:	83 3c 24 0e          	cmpl   $0xe,(%rsp)
    2865:	76 05                	jbe    286c <phase_4+0x3c>
    2867:	e8 d2 05 00 00       	callq  2e3e <explode_bomb>
    286c:	ba 0e 00 00 00       	mov    $0xe,%edx
    2871:	be 00 00 00 00       	mov    $0x0,%esi
    2876:	8b 3c 24             	mov    (%rsp),%edi
    2879:	e8 7c ff ff ff       	callq  27fa <func4>
    287e:	83 f8 23             	cmp    $0x23,%eax
    2881:	75 07                	jne    288a <phase_4+0x5a>
    2883:	83 7c 24 04 23       	cmpl   $0x23,0x4(%rsp)
    2888:	74 05                	je     288f <phase_4+0x5f>
    288a:	e8 af 05 00 00       	callq  2e3e <explode_bomb>
    288f:	48 8b 44 24 08       	mov    0x8(%rsp),%rax
    2894:	64 48 33 04 25 28 00 	xor    %fs:0x28,%rax
    289b:	00 00 
    289d:	75 05                	jne    28a4 <phase_4+0x74>
    289f:	48 83 c4 18          	add    $0x18,%rsp
    28a3:	c3                   	retq   
    28a4:	e8 a7 f9 ff ff       	callq  2250 <__stack_chk_fail@plt>

00000000000028a9 <phase_5>:
    28a9:	f3 0f 1e fa          	endbr64 
    28ad:	53                   	push   %rbx
    28ae:	48 89 fb             	mov    %rdi,%rbx
    28b1:	e8 94 02 00 00       	callq  2b4a <string_length>
    28b6:	83 f8 06             	cmp    $0x6,%eax
    28b9:	75 2c                	jne    28e7 <phase_5+0x3e>
    28bb:	48 89 d8             	mov    %rbx,%rax
    28be:	48 8d 7b 06          	lea    0x6(%rbx),%rdi
    28c2:	b9 00 00 00 00       	mov    $0x0,%ecx
    28c7:	48 8d 35 12 19 00 00 	lea    0x1912(%rip),%rsi        # 41e0 <array.3473>
    28ce:	0f b6 10             	movzbl (%rax),%edx
    28d1:	83 e2 0f             	and    $0xf,%edx
    28d4:	03 0c 96             	add    (%rsi,%rdx,4),%ecx
    28d7:	48 83 c0 01          	add    $0x1,%rax
    28db:	48 39 f8             	cmp    %rdi,%rax
    28de:	75 ee                	jne    28ce <phase_5+0x25>
    28e0:	83 f9 2c             	cmp    $0x2c,%ecx
    28e3:	75 09                	jne    28ee <phase_5+0x45>
    28e5:	5b                   	pop    %rbx
    28e6:	c3                   	retq   
    28e7:	e8 52 05 00 00       	callq  2e3e <explode_bomb>
    28ec:	eb cd                	jmp    28bb <phase_5+0x12>
    28ee:	e8 4b 05 00 00       	callq  2e3e <explode_bomb>
    28f3:	eb f0                	jmp    28e5 <phase_5+0x3c>

00000000000028f5 <phase_6>:
    28f5:	f3 0f 1e fa          	endbr64 
    28f9:	41 56                	push   %r14
    28fb:	41 55                	push   %r13
    28fd:	41 54                	push   %r12
    28ff:	55                   	push   %rbp
    2900:	53                   	push   %rbx
    2901:	48 83 ec 60          	sub    $0x60,%rsp
    2905:	64 48 8b 04 25 28 00 	mov    %fs:0x28,%rax
    290c:	00 00 
    290e:	48 89 44 24 58       	mov    %rax,0x58(%rsp)
    2913:	31 c0                	xor    %eax,%eax
    2915:	49 89 e5             	mov    %rsp,%r13
    2918:	4c 89 ee             	mov    %r13,%rsi
    291b:	e8 60 05 00 00       	callq  2e80 <read_six_numbers>
    2920:	41 be 01 00 00 00    	mov    $0x1,%r14d
    2926:	49 89 e4             	mov    %rsp,%r12
    2929:	eb 28                	jmp    2953 <phase_6+0x5e>
    292b:	e8 0e 05 00 00       	callq  2e3e <explode_bomb>
    2930:	eb 30                	jmp    2962 <phase_6+0x6d>
    2932:	48 83 c3 01          	add    $0x1,%rbx
    2936:	83 fb 05             	cmp    $0x5,%ebx
    2939:	7f 10                	jg     294b <phase_6+0x56>
    293b:	41 8b 04 9c          	mov    (%r12,%rbx,4),%eax
    293f:	39 45 00             	cmp    %eax,0x0(%rbp)
    2942:	75 ee                	jne    2932 <phase_6+0x3d>
    2944:	e8 f5 04 00 00       	callq  2e3e <explode_bomb>
    2949:	eb e7                	jmp    2932 <phase_6+0x3d>
    294b:	49 83 c6 01          	add    $0x1,%r14
    294f:	49 83 c5 04          	add    $0x4,%r13
    2953:	4c 89 ed             	mov    %r13,%rbp
    2956:	41 8b 45 00          	mov    0x0(%r13),%eax
    295a:	83 e8 01             	sub    $0x1,%eax
    295d:	83 f8 05             	cmp    $0x5,%eax
    2960:	77 c9                	ja     292b <phase_6+0x36>
    2962:	41 83 fe 05          	cmp    $0x5,%r14d
    2966:	7f 05                	jg     296d <phase_6+0x78>
    2968:	4c 89 f3             	mov    %r14,%rbx
    296b:	eb ce                	jmp    293b <phase_6+0x46>
    296d:	be 00 00 00 00       	mov    $0x0,%esi
    2972:	8b 0c b4             	mov    (%rsp,%rsi,4),%ecx
    2975:	b8 01 00 00 00       	mov    $0x1,%eax
    297a:	48 8d 15 af 4c 00 00 	lea    0x4caf(%rip),%rdx        # 7630 <node1>
    2981:	83 f9 01             	cmp    $0x1,%ecx
    2984:	7e 0b                	jle    2991 <phase_6+0x9c>
    2986:	48 8b 52 08          	mov    0x8(%rdx),%rdx
    298a:	83 c0 01             	add    $0x1,%eax
    298d:	39 c8                	cmp    %ecx,%eax
    298f:	75 f5                	jne    2986 <phase_6+0x91>
    2991:	48 89 54 f4 20       	mov    %rdx,0x20(%rsp,%rsi,8)
    2996:	48 83 c6 01          	add    $0x1,%rsi
    299a:	48 83 fe 06          	cmp    $0x6,%rsi
    299e:	75 d2                	jne    2972 <phase_6+0x7d>
    29a0:	48 8b 5c 24 20       	mov    0x20(%rsp),%rbx
    29a5:	48 8b 44 24 28       	mov    0x28(%rsp),%rax
    29aa:	48 89 43 08          	mov    %rax,0x8(%rbx)
    29ae:	48 8b 54 24 30       	mov    0x30(%rsp),%rdx
    29b3:	48 89 50 08          	mov    %rdx,0x8(%rax)
    29b7:	48 8b 44 24 38       	mov    0x38(%rsp),%rax
    29bc:	48 89 42 08          	mov    %rax,0x8(%rdx)
    29c0:	48 8b 54 24 40       	mov    0x40(%rsp),%rdx
    29c5:	48 89 50 08          	mov    %rdx,0x8(%rax)
    29c9:	48 8b 44 24 48       	mov    0x48(%rsp),%rax
    29ce:	48 89 42 08          	mov    %rax,0x8(%rdx)
    29d2:	48 c7 40 08 00 00 00 	movq   $0x0,0x8(%rax)
    29d9:	00 
    29da:	bd 05 00 00 00       	mov    $0x5,%ebp
    29df:	eb 09                	jmp    29ea <phase_6+0xf5>
    29e1:	48 8b 5b 08          	mov    0x8(%rbx),%rbx
    29e5:	83 ed 01             	sub    $0x1,%ebp
    29e8:	74 11                	je     29fb <phase_6+0x106>
    29ea:	48 8b 43 08          	mov    0x8(%rbx),%rax
    29ee:	8b 00                	mov    (%rax),%eax
    29f0:	39 03                	cmp    %eax,(%rbx)
    29f2:	7e ed                	jle    29e1 <phase_6+0xec>
    29f4:	e8 45 04 00 00       	callq  2e3e <explode_bomb>
    29f9:	eb e6                	jmp    29e1 <phase_6+0xec>
    29fb:	48 8b 44 24 58       	mov    0x58(%rsp),%rax
    2a00:	64 48 33 04 25 28 00 	xor    %fs:0x28,%rax
    2a07:	00 00 
    2a09:	75 0d                	jne    2a18 <phase_6+0x123>
    2a0b:	48 83 c4 60          	add    $0x60,%rsp
    2a0f:	5b                   	pop    %rbx
    2a10:	5d                   	pop    %rbp
    2a11:	41 5c                	pop    %r12
    2a13:	41 5d                	pop    %r13
    2a15:	41 5e                	pop    %r14
    2a17:	c3                   	retq   
    2a18:	e8 33 f8 ff ff       	callq  2250 <__stack_chk_fail@plt>

0000000000002a1d <fun7>:
    2a1d:	f3 0f 1e fa          	endbr64 
    2a21:	48 85 ff             	test   %rdi,%rdi
    2a24:	74 32                	je     2a58 <fun7+0x3b>
    2a26:	48 83 ec 08          	sub    $0x8,%rsp
    2a2a:	8b 17                	mov    (%rdi),%edx
    2a2c:	39 f2                	cmp    %esi,%edx
    2a2e:	7f 0c                	jg     2a3c <fun7+0x1f>
    2a30:	b8 00 00 00 00       	mov    $0x0,%eax
    2a35:	75 12                	jne    2a49 <fun7+0x2c>
    2a37:	48 83 c4 08          	add    $0x8,%rsp
    2a3b:	c3                   	retq   
    2a3c:	48 8b 7f 08          	mov    0x8(%rdi),%rdi
    2a40:	e8 d8 ff ff ff       	callq  2a1d <fun7>
    2a45:	01 c0                	add    %eax,%eax
    2a47:	eb ee                	jmp    2a37 <fun7+0x1a>
    2a49:	48 8b 7f 10          	mov    0x10(%rdi),%rdi
    2a4d:	e8 cb ff ff ff       	callq  2a1d <fun7>
    2a52:	8d 44 00 01          	lea    0x1(%rax,%rax,1),%eax
    2a56:	eb df                	jmp    2a37 <fun7+0x1a>
    2a58:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    2a5d:	c3                   	retq   

0000000000002a5e <secret_phase>:
    2a5e:	f3 0f 1e fa          	endbr64 
    2a62:	53                   	push   %rbx
    2a63:	e8 5d 04 00 00       	callq  2ec5 <read_line>
    2a68:	48 89 c7             	mov    %rax,%rdi
    2a6b:	ba 0a 00 00 00       	mov    $0xa,%edx
    2a70:	be 00 00 00 00       	mov    $0x0,%esi
    2a75:	e8 56 f8 ff ff       	callq  22d0 <strtol@plt>
    2a7a:	48 89 c3             	mov    %rax,%rbx
    2a7d:	8d 40 ff             	lea    -0x1(%rax),%eax
    2a80:	3d e8 03 00 00       	cmp    $0x3e8,%eax
    2a85:	77 26                	ja     2aad <secret_phase+0x4f>
    2a87:	89 de                	mov    %ebx,%esi
    2a89:	48 8d 3d c0 4a 00 00 	lea    0x4ac0(%rip),%rdi        # 7550 <n1>
    2a90:	e8 88 ff ff ff       	callq  2a1d <fun7>
    2a95:	83 f8 01             	cmp    $0x1,%eax
    2a98:	75 1a                	jne    2ab4 <secret_phase+0x56>
    2a9a:	48 8d 3d e7 16 00 00 	lea    0x16e7(%rip),%rdi        # 4188 <_IO_stdin_used+0x188>
    2aa1:	e8 8a f7 ff ff       	callq  2230 <puts@plt>
    2aa6:	e8 62 05 00 00       	callq  300d <phase_defused>
    2aab:	5b                   	pop    %rbx
    2aac:	c3                   	retq   
    2aad:	e8 8c 03 00 00       	callq  2e3e <explode_bomb>
    2ab2:	eb d3                	jmp    2a87 <secret_phase+0x29>
    2ab4:	e8 85 03 00 00       	callq  2e3e <explode_bomb>
    2ab9:	eb df                	jmp    2a9a <secret_phase+0x3c>

0000000000002abb <sig_handler>:
    2abb:	f3 0f 1e fa          	endbr64 
    2abf:	50                   	push   %rax
    2ac0:	58                   	pop    %rax
    2ac1:	48 83 ec 08          	sub    $0x8,%rsp
    2ac5:	48 8d 3d 54 17 00 00 	lea    0x1754(%rip),%rdi        # 4220 <array.3473+0x40>
    2acc:	e8 5f f7 ff ff       	callq  2230 <puts@plt>
    2ad1:	bf 03 00 00 00       	mov    $0x3,%edi
    2ad6:	e8 85 f8 ff ff       	callq  2360 <sleep@plt>
    2adb:	48 8d 35 a7 18 00 00 	lea    0x18a7(%rip),%rsi        # 4389 <array.3473+0x1a9>
    2ae2:	bf 01 00 00 00       	mov    $0x1,%edi
    2ae7:	b8 00 00 00 00       	mov    $0x0,%eax
    2aec:	e8 0f f8 ff ff       	callq  2300 <__printf_chk@plt>
    2af1:	48 8b 3d 88 4f 00 00 	mov    0x4f88(%rip),%rdi        # 7a80 <stdout@@GLIBC_2.2.5>
    2af8:	e8 e3 f7 ff ff       	callq  22e0 <fflush@plt>
    2afd:	bf 01 00 00 00       	mov    $0x1,%edi
    2b02:	e8 59 f8 ff ff       	callq  2360 <sleep@plt>
    2b07:	48 8d 3d 83 18 00 00 	lea    0x1883(%rip),%rdi        # 4391 <array.3473+0x1b1>
    2b0e:	e8 1d f7 ff ff       	callq  2230 <puts@plt>
    2b13:	bf 10 00 00 00       	mov    $0x10,%edi
    2b18:	e8 13 f8 ff ff       	callq  2330 <exit@plt>

0000000000002b1d <invalid_phase>:
    2b1d:	f3 0f 1e fa          	endbr64 
    2b21:	50                   	push   %rax
    2b22:	58                   	pop    %rax
    2b23:	48 83 ec 08          	sub    $0x8,%rsp
    2b27:	48 89 fa             	mov    %rdi,%rdx
    2b2a:	48 8d 35 68 18 00 00 	lea    0x1868(%rip),%rsi        # 4399 <array.3473+0x1b9>
    2b31:	bf 01 00 00 00       	mov    $0x1,%edi
    2b36:	b8 00 00 00 00       	mov    $0x0,%eax
    2b3b:	e8 c0 f7 ff ff       	callq  2300 <__printf_chk@plt>
    2b40:	bf 08 00 00 00       	mov    $0x8,%edi
    2b45:	e8 e6 f7 ff ff       	callq  2330 <exit@plt>

0000000000002b4a <string_length>:
    2b4a:	f3 0f 1e fa          	endbr64 
    2b4e:	80 3f 00             	cmpb   $0x0,(%rdi)
    2b51:	74 12                	je     2b65 <string_length+0x1b>
    2b53:	b8 00 00 00 00       	mov    $0x0,%eax
    2b58:	48 83 c7 01          	add    $0x1,%rdi
    2b5c:	83 c0 01             	add    $0x1,%eax
    2b5f:	80 3f 00             	cmpb   $0x0,(%rdi)
    2b62:	75 f4                	jne    2b58 <string_length+0xe>
    2b64:	c3                   	retq   
    2b65:	b8 00 00 00 00       	mov    $0x0,%eax
    2b6a:	c3                   	retq   

0000000000002b6b <strings_not_equal>:
    2b6b:	f3 0f 1e fa          	endbr64 
    2b6f:	41 54                	push   %r12
    2b71:	55                   	push   %rbp
    2b72:	53                   	push   %rbx
    2b73:	48 89 fb             	mov    %rdi,%rbx
    2b76:	48 89 f5             	mov    %rsi,%rbp
    2b79:	e8 cc ff ff ff       	callq  2b4a <string_length>
    2b7e:	41 89 c4             	mov    %eax,%r12d
    2b81:	48 89 ef             	mov    %rbp,%rdi
    2b84:	e8 c1 ff ff ff       	callq  2b4a <string_length>
    2b89:	89 c2                	mov    %eax,%edx
    2b8b:	b8 01 00 00 00       	mov    $0x1,%eax
    2b90:	41 39 d4             	cmp    %edx,%r12d
    2b93:	75 31                	jne    2bc6 <strings_not_equal+0x5b>
    2b95:	0f b6 13             	movzbl (%rbx),%edx
    2b98:	84 d2                	test   %dl,%dl
    2b9a:	74 1e                	je     2bba <strings_not_equal+0x4f>
    2b9c:	b8 00 00 00 00       	mov    $0x0,%eax
    2ba1:	38 54 05 00          	cmp    %dl,0x0(%rbp,%rax,1)
    2ba5:	75 1a                	jne    2bc1 <strings_not_equal+0x56>
    2ba7:	48 83 c0 01          	add    $0x1,%rax
    2bab:	0f b6 14 03          	movzbl (%rbx,%rax,1),%edx
    2baf:	84 d2                	test   %dl,%dl
    2bb1:	75 ee                	jne    2ba1 <strings_not_equal+0x36>
    2bb3:	b8 00 00 00 00       	mov    $0x0,%eax
    2bb8:	eb 0c                	jmp    2bc6 <strings_not_equal+0x5b>
    2bba:	b8 00 00 00 00       	mov    $0x0,%eax
    2bbf:	eb 05                	jmp    2bc6 <strings_not_equal+0x5b>
    2bc1:	b8 01 00 00 00       	mov    $0x1,%eax
    2bc6:	5b                   	pop    %rbx
    2bc7:	5d                   	pop    %rbp
    2bc8:	41 5c                	pop    %r12
    2bca:	c3                   	retq   

0000000000002bcb <initialize_bomb>:
    2bcb:	f3 0f 1e fa          	endbr64 
    2bcf:	55                   	push   %rbp
    2bd0:	53                   	push   %rbx
    2bd1:	48 81 ec 00 10 00 00 	sub    $0x1000,%rsp
    2bd8:	48 83 0c 24 00       	orq    $0x0,(%rsp)
    2bdd:	48 81 ec 00 10 00 00 	sub    $0x1000,%rsp
    2be4:	48 83 0c 24 00       	orq    $0x0,(%rsp)
    2be9:	48 83 ec 58          	sub    $0x58,%rsp
    2bed:	64 48 8b 04 25 28 00 	mov    %fs:0x28,%rax
    2bf4:	00 00 
    2bf6:	48 89 84 24 48 20 00 	mov    %rax,0x2048(%rsp)
    2bfd:	00 
    2bfe:	31 c0                	xor    %eax,%eax
    2c00:	48 8d 35 b4 fe ff ff 	lea    -0x14c(%rip),%rsi        # 2abb <sig_handler>
    2c07:	bf 02 00 00 00       	mov    $0x2,%edi
    2c0c:	e8 8f f6 ff ff       	callq  22a0 <signal@plt>
    2c11:	48 89 e7             	mov    %rsp,%rdi
    2c14:	be 40 00 00 00       	mov    $0x40,%esi
    2c19:	e8 02 f7 ff ff       	callq  2320 <gethostname@plt>
    2c1e:	85 c0                	test   %eax,%eax
    2c20:	75 5a                	jne    2c7c <initialize_bomb+0xb1>
    2c22:	48 8b 3d 57 4a 00 00 	mov    0x4a57(%rip),%rdi        # 7680 <host_table>
    2c29:	48 8d 1d 58 4a 00 00 	lea    0x4a58(%rip),%rbx        # 7688 <host_table+0x8>
    2c30:	48 89 e5             	mov    %rsp,%rbp
    2c33:	48 85 ff             	test   %rdi,%rdi
    2c36:	74 19                	je     2c51 <initialize_bomb+0x86>
    2c38:	48 89 ee             	mov    %rbp,%rsi
    2c3b:	e8 c0 f5 ff ff       	callq  2200 <strcasecmp@plt>
    2c40:	85 c0                	test   %eax,%eax
    2c42:	74 0d                	je     2c51 <initialize_bomb+0x86>
    2c44:	48 83 c3 08          	add    $0x8,%rbx
    2c48:	48 8b 7b f8          	mov    -0x8(%rbx),%rdi
    2c4c:	48 85 ff             	test   %rdi,%rdi
    2c4f:	75 e7                	jne    2c38 <initialize_bomb+0x6d>
    2c51:	48 8d 7c 24 40       	lea    0x40(%rsp),%rdi
    2c56:	e8 c9 0d 00 00       	callq  3a24 <init_driver>
    2c5b:	85 c0                	test   %eax,%eax
    2c5d:	78 33                	js     2c92 <initialize_bomb+0xc7>
    2c5f:	48 8b 84 24 48 20 00 	mov    0x2048(%rsp),%rax
    2c66:	00 
    2c67:	64 48 33 04 25 28 00 	xor    %fs:0x28,%rax
    2c6e:	00 00 
    2c70:	75 45                	jne    2cb7 <initialize_bomb+0xec>
    2c72:	48 81 c4 58 20 00 00 	add    $0x2058,%rsp
    2c79:	5b                   	pop    %rbx
    2c7a:	5d                   	pop    %rbp
    2c7b:	c3                   	retq   
    2c7c:	48 8d 3d d5 15 00 00 	lea    0x15d5(%rip),%rdi        # 4258 <array.3473+0x78>
    2c83:	e8 a8 f5 ff ff       	callq  2230 <puts@plt>
    2c88:	bf 08 00 00 00       	mov    $0x8,%edi
    2c8d:	e8 9e f6 ff ff       	callq  2330 <exit@plt>
    2c92:	48 8d 54 24 40       	lea    0x40(%rsp),%rdx
    2c97:	48 8d 35 0c 17 00 00 	lea    0x170c(%rip),%rsi        # 43aa <array.3473+0x1ca>
    2c9e:	bf 01 00 00 00       	mov    $0x1,%edi
    2ca3:	b8 00 00 00 00       	mov    $0x0,%eax
    2ca8:	e8 53 f6 ff ff       	callq  2300 <__printf_chk@plt>
    2cad:	bf 08 00 00 00       	mov    $0x8,%edi
    2cb2:	e8 79 f6 ff ff       	callq  2330 <exit@plt>
    2cb7:	e8 94 f5 ff ff       	callq  2250 <__stack_chk_fail@plt>

0000000000002cbc <initialize_bomb_solve>:
    2cbc:	f3 0f 1e fa          	endbr64 
    2cc0:	c3                   	retq   

0000000000002cc1 <blank_line>:
    2cc1:	f3 0f 1e fa          	endbr64 
    2cc5:	55                   	push   %rbp
    2cc6:	53                   	push   %rbx
    2cc7:	48 83 ec 08          	sub    $0x8,%rsp
    2ccb:	48 89 fd             	mov    %rdi,%rbp
    2cce:	0f b6 5d 00          	movzbl 0x0(%rbp),%ebx
    2cd2:	84 db                	test   %bl,%bl
    2cd4:	74 1e                	je     2cf4 <blank_line+0x33>
    2cd6:	e8 95 f6 ff ff       	callq  2370 <__ctype_b_loc@plt>
    2cdb:	48 83 c5 01          	add    $0x1,%rbp
    2cdf:	48 0f be db          	movsbq %bl,%rbx
    2ce3:	48 8b 00             	mov    (%rax),%rax
    2ce6:	f6 44 58 01 20       	testb  $0x20,0x1(%rax,%rbx,2)
    2ceb:	75 e1                	jne    2cce <blank_line+0xd>
    2ced:	b8 00 00 00 00       	mov    $0x0,%eax
    2cf2:	eb 05                	jmp    2cf9 <blank_line+0x38>
    2cf4:	b8 01 00 00 00       	mov    $0x1,%eax
    2cf9:	48 83 c4 08          	add    $0x8,%rsp
    2cfd:	5b                   	pop    %rbx
    2cfe:	5d                   	pop    %rbp
    2cff:	c3                   	retq   

0000000000002d00 <skip>:
    2d00:	f3 0f 1e fa          	endbr64 
    2d04:	55                   	push   %rbp
    2d05:	53                   	push   %rbx
    2d06:	48 83 ec 08          	sub    $0x8,%rsp
    2d0a:	48 8d 2d af 4d 00 00 	lea    0x4daf(%rip),%rbp        # 7ac0 <input_strings>
    2d11:	48 63 05 94 4d 00 00 	movslq 0x4d94(%rip),%rax        # 7aac <num_input_strings>
    2d18:	48 8d 3c 80          	lea    (%rax,%rax,4),%rdi
    2d1c:	48 c1 e7 04          	shl    $0x4,%rdi
    2d20:	48 01 ef             	add    %rbp,%rdi
    2d23:	48 8b 15 86 4d 00 00 	mov    0x4d86(%rip),%rdx        # 7ab0 <infile>
    2d2a:	be 50 00 00 00       	mov    $0x50,%esi
    2d2f:	e8 5c f5 ff ff       	callq  2290 <fgets@plt>
    2d34:	48 89 c3             	mov    %rax,%rbx
    2d37:	48 85 c0             	test   %rax,%rax
    2d3a:	74 0c                	je     2d48 <skip+0x48>
    2d3c:	48 89 c7             	mov    %rax,%rdi
    2d3f:	e8 7d ff ff ff       	callq  2cc1 <blank_line>
    2d44:	85 c0                	test   %eax,%eax
    2d46:	75 c9                	jne    2d11 <skip+0x11>
    2d48:	48 89 d8             	mov    %rbx,%rax
    2d4b:	48 83 c4 08          	add    $0x8,%rsp
    2d4f:	5b                   	pop    %rbx
    2d50:	5d                   	pop    %rbp
    2d51:	c3                   	retq   

0000000000002d52 <send_msg>:
    2d52:	f3 0f 1e fa          	endbr64 
    2d56:	53                   	push   %rbx
    2d57:	4c 8d 9c 24 00 c0 ff 	lea    -0x4000(%rsp),%r11
    2d5e:	ff 
    2d5f:	48 81 ec 00 10 00 00 	sub    $0x1000,%rsp
    2d66:	48 83 0c 24 00       	orq    $0x0,(%rsp)
    2d6b:	4c 39 dc             	cmp    %r11,%rsp
    2d6e:	75 ef                	jne    2d5f <send_msg+0xd>
    2d70:	48 83 ec 10          	sub    $0x10,%rsp
    2d74:	64 48 8b 04 25 28 00 	mov    %fs:0x28,%rax
    2d7b:	00 00 
    2d7d:	48 89 84 24 08 40 00 	mov    %rax,0x4008(%rsp)
    2d84:	00 
    2d85:	31 c0                	xor    %eax,%eax
    2d87:	8b 15 1f 4d 00 00    	mov    0x4d1f(%rip),%edx        # 7aac <num_input_strings>
    2d8d:	8d 42 ff             	lea    -0x1(%rdx),%eax
    2d90:	48 98                	cltq   
    2d92:	48 8d 04 80          	lea    (%rax,%rax,4),%rax
    2d96:	48 c1 e0 04          	shl    $0x4,%rax
    2d9a:	48 8d 0d 1f 4d 00 00 	lea    0x4d1f(%rip),%rcx        # 7ac0 <input_strings>
    2da1:	48 01 c8             	add    %rcx,%rax
    2da4:	85 ff                	test   %edi,%edi
    2da6:	4c 8d 0d 17 16 00 00 	lea    0x1617(%rip),%r9        # 43c4 <array.3473+0x1e4>
    2dad:	48 8d 0d 18 16 00 00 	lea    0x1618(%rip),%rcx        # 43cc <array.3473+0x1ec>
    2db4:	4c 0f 44 c9          	cmove  %rcx,%r9
    2db8:	48 89 e3             	mov    %rsp,%rbx
    2dbb:	50                   	push   %rax
    2dbc:	52                   	push   %rdx
    2dbd:	44 8b 05 7c 47 00 00 	mov    0x477c(%rip),%r8d        # 7540 <bomb_id>
    2dc4:	48 8d 0d 0a 16 00 00 	lea    0x160a(%rip),%rcx        # 43d5 <array.3473+0x1f5>
    2dcb:	ba 00 20 00 00       	mov    $0x2000,%edx
    2dd0:	be 01 00 00 00       	mov    $0x1,%esi
    2dd5:	48 89 df             	mov    %rbx,%rdi
    2dd8:	b8 00 00 00 00       	mov    $0x0,%eax
    2ddd:	e8 9e f5 ff ff       	callq  2380 <__sprintf_chk@plt>
    2de2:	48 8d 8c 24 10 20 00 	lea    0x2010(%rsp),%rcx
    2de9:	00 
    2dea:	ba 00 00 00 00       	mov    $0x0,%edx
    2def:	48 89 de             	mov    %rbx,%rsi
    2df2:	48 8d 3d 47 43 00 00 	lea    0x4347(%rip),%rdi        # 7140 <userid>
    2df9:	e8 1b 0e 00 00       	callq  3c19 <driver_post>
    2dfe:	48 83 c4 10          	add    $0x10,%rsp
    2e02:	85 c0                	test   %eax,%eax
    2e04:	78 1c                	js     2e22 <send_msg+0xd0>
    2e06:	48 8b 84 24 08 40 00 	mov    0x4008(%rsp),%rax
    2e0d:	00 
    2e0e:	64 48 33 04 25 28 00 	xor    %fs:0x28,%rax
    2e15:	00 00 
    2e17:	75 20                	jne    2e39 <send_msg+0xe7>
    2e19:	48 81 c4 10 40 00 00 	add    $0x4010,%rsp
    2e20:	5b                   	pop    %rbx
    2e21:	c3                   	retq   
    2e22:	48 8d bc 24 00 20 00 	lea    0x2000(%rsp),%rdi
    2e29:	00 
    2e2a:	e8 01 f4 ff ff       	callq  2230 <puts@plt>
    2e2f:	bf 00 00 00 00       	mov    $0x0,%edi
    2e34:	e8 f7 f4 ff ff       	callq  2330 <exit@plt>
    2e39:	e8 12 f4 ff ff       	callq  2250 <__stack_chk_fail@plt>

0000000000002e3e <explode_bomb>:
    2e3e:	f3 0f 1e fa          	endbr64 
    2e42:	50                   	push   %rax
    2e43:	58                   	pop    %rax
    2e44:	48 83 ec 08          	sub    $0x8,%rsp
    2e48:	48 8d 3d 92 15 00 00 	lea    0x1592(%rip),%rdi        # 43e1 <array.3473+0x201>
    2e4f:	e8 dc f3 ff ff       	callq  2230 <puts@plt>
    2e54:	48 8d 3d 8f 15 00 00 	lea    0x158f(%rip),%rdi        # 43ea <array.3473+0x20a>
    2e5b:	e8 d0 f3 ff ff       	callq  2230 <puts@plt>
    2e60:	bf 00 00 00 00       	mov    $0x0,%edi
    2e65:	e8 e8 fe ff ff       	callq  2d52 <send_msg>
    2e6a:	48 8d 3d 1f 14 00 00 	lea    0x141f(%rip),%rdi        # 4290 <array.3473+0xb0>
    2e71:	e8 ba f3 ff ff       	callq  2230 <puts@plt>
    2e76:	bf 08 00 00 00       	mov    $0x8,%edi
    2e7b:	e8 b0 f4 ff ff       	callq  2330 <exit@plt>

0000000000002e80 <read_six_numbers>:
    2e80:	f3 0f 1e fa          	endbr64 
    2e84:	48 83 ec 08          	sub    $0x8,%rsp
    2e88:	48 89 f2             	mov    %rsi,%rdx
    2e8b:	48 8d 4e 04          	lea    0x4(%rsi),%rcx
    2e8f:	48 8d 46 14          	lea    0x14(%rsi),%rax
    2e93:	50                   	push   %rax
    2e94:	48 8d 46 10          	lea    0x10(%rsi),%rax
    2e98:	50                   	push   %rax
    2e99:	4c 8d 4e 0c          	lea    0xc(%rsi),%r9
    2e9d:	4c 8d 46 08          	lea    0x8(%rsi),%r8
    2ea1:	48 8d 35 59 15 00 00 	lea    0x1559(%rip),%rsi        # 4401 <array.3473+0x221>
    2ea8:	b8 00 00 00 00       	mov    $0x0,%eax
    2ead:	e8 3e f4 ff ff       	callq  22f0 <__isoc99_sscanf@plt>
    2eb2:	48 83 c4 10          	add    $0x10,%rsp
    2eb6:	83 f8 05             	cmp    $0x5,%eax
    2eb9:	7e 05                	jle    2ec0 <read_six_numbers+0x40>
    2ebb:	48 83 c4 08          	add    $0x8,%rsp
    2ebf:	c3                   	retq   
    2ec0:	e8 79 ff ff ff       	callq  2e3e <explode_bomb>

0000000000002ec5 <read_line>:
    2ec5:	f3 0f 1e fa          	endbr64 
    2ec9:	48 83 ec 08          	sub    $0x8,%rsp
    2ecd:	b8 00 00 00 00       	mov    $0x0,%eax
    2ed2:	e8 29 fe ff ff       	callq  2d00 <skip>
    2ed7:	48 85 c0             	test   %rax,%rax
    2eda:	74 6f                	je     2f4b <read_line+0x86>
    2edc:	8b 35 ca 4b 00 00    	mov    0x4bca(%rip),%esi        # 7aac <num_input_strings>
    2ee2:	48 63 c6             	movslq %esi,%rax
    2ee5:	48 8d 14 80          	lea    (%rax,%rax,4),%rdx
    2ee9:	48 c1 e2 04          	shl    $0x4,%rdx
    2eed:	48 8d 05 cc 4b 00 00 	lea    0x4bcc(%rip),%rax        # 7ac0 <input_strings>
    2ef4:	48 01 c2             	add    %rax,%rdx
    2ef7:	48 c7 c1 ff ff ff ff 	mov    $0xffffffffffffffff,%rcx
    2efe:	b8 00 00 00 00       	mov    $0x0,%eax
    2f03:	48 89 d7             	mov    %rdx,%rdi
    2f06:	f2 ae                	repnz scas %es:(%rdi),%al
    2f08:	48 f7 d1             	not    %rcx
    2f0b:	48 83 e9 01          	sub    $0x1,%rcx
    2f0f:	83 f9 4e             	cmp    $0x4e,%ecx
    2f12:	0f 8f ab 00 00 00    	jg     2fc3 <read_line+0xfe>
    2f18:	83 e9 01             	sub    $0x1,%ecx
    2f1b:	48 63 c9             	movslq %ecx,%rcx
    2f1e:	48 63 c6             	movslq %esi,%rax
    2f21:	48 8d 04 80          	lea    (%rax,%rax,4),%rax
    2f25:	48 c1 e0 04          	shl    $0x4,%rax
    2f29:	48 89 c7             	mov    %rax,%rdi
    2f2c:	48 8d 05 8d 4b 00 00 	lea    0x4b8d(%rip),%rax        # 7ac0 <input_strings>
    2f33:	48 01 f8             	add    %rdi,%rax
    2f36:	c6 04 08 00          	movb   $0x0,(%rax,%rcx,1)
    2f3a:	83 c6 01             	add    $0x1,%esi
    2f3d:	89 35 69 4b 00 00    	mov    %esi,0x4b69(%rip)        # 7aac <num_input_strings>
    2f43:	48 89 d0             	mov    %rdx,%rax
    2f46:	48 83 c4 08          	add    $0x8,%rsp
    2f4a:	c3                   	retq   
    2f4b:	48 8b 05 3e 4b 00 00 	mov    0x4b3e(%rip),%rax        # 7a90 <stdin@@GLIBC_2.2.5>
    2f52:	48 39 05 57 4b 00 00 	cmp    %rax,0x4b57(%rip)        # 7ab0 <infile>
    2f59:	74 1b                	je     2f76 <read_line+0xb1>
    2f5b:	48 8d 3d cf 14 00 00 	lea    0x14cf(%rip),%rdi        # 4431 <array.3473+0x251>
    2f62:	e8 89 f2 ff ff       	callq  21f0 <getenv@plt>
    2f67:	48 85 c0             	test   %rax,%rax
    2f6a:	74 20                	je     2f8c <read_line+0xc7>
    2f6c:	bf 00 00 00 00       	mov    $0x0,%edi
    2f71:	e8 ba f3 ff ff       	callq  2330 <exit@plt>
    2f76:	48 8d 3d 96 14 00 00 	lea    0x1496(%rip),%rdi        # 4413 <array.3473+0x233>
    2f7d:	e8 ae f2 ff ff       	callq  2230 <puts@plt>
    2f82:	bf 08 00 00 00       	mov    $0x8,%edi
    2f87:	e8 a4 f3 ff ff       	callq  2330 <exit@plt>
    2f8c:	48 8b 05 fd 4a 00 00 	mov    0x4afd(%rip),%rax        # 7a90 <stdin@@GLIBC_2.2.5>
    2f93:	48 89 05 16 4b 00 00 	mov    %rax,0x4b16(%rip)        # 7ab0 <infile>
    2f9a:	b8 00 00 00 00       	mov    $0x0,%eax
    2f9f:	e8 5c fd ff ff       	callq  2d00 <skip>
    2fa4:	48 85 c0             	test   %rax,%rax
    2fa7:	0f 85 2f ff ff ff    	jne    2edc <read_line+0x17>
    2fad:	48 8d 3d 5f 14 00 00 	lea    0x145f(%rip),%rdi        # 4413 <array.3473+0x233>
    2fb4:	e8 77 f2 ff ff       	callq  2230 <puts@plt>
    2fb9:	bf 00 00 00 00       	mov    $0x0,%edi
    2fbe:	e8 6d f3 ff ff       	callq  2330 <exit@plt>
    2fc3:	48 8d 3d 72 14 00 00 	lea    0x1472(%rip),%rdi        # 443c <array.3473+0x25c>
    2fca:	e8 61 f2 ff ff       	callq  2230 <puts@plt>
    2fcf:	8b 05 d7 4a 00 00    	mov    0x4ad7(%rip),%eax        # 7aac <num_input_strings>
    2fd5:	8d 50 01             	lea    0x1(%rax),%edx
    2fd8:	89 15 ce 4a 00 00    	mov    %edx,0x4ace(%rip)        # 7aac <num_input_strings>
    2fde:	48 98                	cltq   
    2fe0:	48 6b c0 50          	imul   $0x50,%rax,%rax
    2fe4:	48 8d 15 d5 4a 00 00 	lea    0x4ad5(%rip),%rdx        # 7ac0 <input_strings>
    2feb:	48 be 2a 2a 2a 74 72 	movabs $0x636e7572742a2a2a,%rsi
    2ff2:	75 6e 63 
    2ff5:	48 bf 61 74 65 64 2a 	movabs $0x2a2a2a64657461,%rdi
    2ffc:	2a 2a 00 
    2fff:	48 89 34 02          	mov    %rsi,(%rdx,%rax,1)
    3003:	48 89 7c 02 08       	mov    %rdi,0x8(%rdx,%rax,1)
    3008:	e8 31 fe ff ff       	callq  2e3e <explode_bomb>

000000000000300d <phase_defused>:
    300d:	f3 0f 1e fa          	endbr64 
    3011:	48 83 ec 78          	sub    $0x78,%rsp
    3015:	64 48 8b 04 25 28 00 	mov    %fs:0x28,%rax
    301c:	00 00 
    301e:	48 89 44 24 68       	mov    %rax,0x68(%rsp)
    3023:	31 c0                	xor    %eax,%eax
    3025:	bf 01 00 00 00       	mov    $0x1,%edi
    302a:	e8 23 fd ff ff       	callq  2d52 <send_msg>
    302f:	83 3d 76 4a 00 00 06 	cmpl   $0x6,0x4a76(%rip)        # 7aac <num_input_strings>
    3036:	74 19                	je     3051 <phase_defused+0x44>
    3038:	48 8b 44 24 68       	mov    0x68(%rsp),%rax
    303d:	64 48 33 04 25 28 00 	xor    %fs:0x28,%rax
    3044:	00 00 
    3046:	0f 85 84 00 00 00    	jne    30d0 <phase_defused+0xc3>
    304c:	48 83 c4 78          	add    $0x78,%rsp
    3050:	c3                   	retq   
    3051:	48 8d 4c 24 0c       	lea    0xc(%rsp),%rcx
    3056:	48 8d 54 24 08       	lea    0x8(%rsp),%rdx
    305b:	4c 8d 44 24 10       	lea    0x10(%rsp),%r8
    3060:	48 8d 35 f0 13 00 00 	lea    0x13f0(%rip),%rsi        # 4457 <array.3473+0x277>
    3067:	48 8d 3d 42 4b 00 00 	lea    0x4b42(%rip),%rdi        # 7bb0 <input_strings+0xf0>
    306e:	b8 00 00 00 00       	mov    $0x0,%eax
    3073:	e8 78 f2 ff ff       	callq  22f0 <__isoc99_sscanf@plt>
    3078:	83 f8 03             	cmp    $0x3,%eax
    307b:	74 1a                	je     3097 <phase_defused+0x8a>
    307d:	48 8d 3d 94 12 00 00 	lea    0x1294(%rip),%rdi        # 4318 <array.3473+0x138>
    3084:	e8 a7 f1 ff ff       	callq  2230 <puts@plt>
    3089:	48 8d 3d b8 12 00 00 	lea    0x12b8(%rip),%rdi        # 4348 <array.3473+0x168>
    3090:	e8 9b f1 ff ff       	callq  2230 <puts@plt>
    3095:	eb a1                	jmp    3038 <phase_defused+0x2b>
    3097:	48 8d 7c 24 10       	lea    0x10(%rsp),%rdi
    309c:	48 8d 35 bd 13 00 00 	lea    0x13bd(%rip),%rsi        # 4460 <array.3473+0x280>
    30a3:	e8 c3 fa ff ff       	callq  2b6b <strings_not_equal>
    30a8:	85 c0                	test   %eax,%eax
    30aa:	75 d1                	jne    307d <phase_defused+0x70>
    30ac:	48 8d 3d 05 12 00 00 	lea    0x1205(%rip),%rdi        # 42b8 <array.3473+0xd8>
    30b3:	e8 78 f1 ff ff       	callq  2230 <puts@plt>
    30b8:	48 8d 3d 21 12 00 00 	lea    0x1221(%rip),%rdi        # 42e0 <array.3473+0x100>
    30bf:	e8 6c f1 ff ff       	callq  2230 <puts@plt>
    30c4:	b8 00 00 00 00       	mov    $0x0,%eax
    30c9:	e8 90 f9 ff ff       	callq  2a5e <secret_phase>
    30ce:	eb ad                	jmp    307d <phase_defused+0x70>
    30d0:	e8 7b f1 ff ff       	callq  2250 <__stack_chk_fail@plt>

00000000000030d5 <sigalrm_handler>:
    30d5:	f3 0f 1e fa          	endbr64 
    30d9:	50                   	push   %rax
    30da:	58                   	pop    %rax
    30db:	48 83 ec 08          	sub    $0x8,%rsp
    30df:	b9 00 00 00 00       	mov    $0x0,%ecx
    30e4:	48 8d 15 7d 18 00 00 	lea    0x187d(%rip),%rdx        # 4968 <array.3473+0x788>
    30eb:	be 01 00 00 00       	mov    $0x1,%esi
    30f0:	48 8b 3d a9 49 00 00 	mov    0x49a9(%rip),%rdi        # 7aa0 <stderr@@GLIBC_2.2.5>
    30f7:	b8 00 00 00 00       	mov    $0x0,%eax
    30fc:	e8 4f f2 ff ff       	callq  2350 <__fprintf_chk@plt>
    3101:	bf 01 00 00 00       	mov    $0x1,%edi
    3106:	e8 25 f2 ff ff       	callq  2330 <exit@plt>

000000000000310b <rio_readlineb>:
    310b:	41 56                	push   %r14
    310d:	41 55                	push   %r13
    310f:	41 54                	push   %r12
    3111:	55                   	push   %rbp
    3112:	53                   	push   %rbx
    3113:	48 89 f5             	mov    %rsi,%rbp
    3116:	48 83 fa 01          	cmp    $0x1,%rdx
    311a:	0f 86 90 00 00 00    	jbe    31b0 <rio_readlineb+0xa5>
    3120:	48 89 fb             	mov    %rdi,%rbx
    3123:	4c 8d 74 16 ff       	lea    -0x1(%rsi,%rdx,1),%r14
    3128:	41 bd 01 00 00 00    	mov    $0x1,%r13d
    312e:	4c 8d 67 10          	lea    0x10(%rdi),%r12
    3132:	eb 54                	jmp    3188 <rio_readlineb+0x7d>
    3134:	e8 d7 f0 ff ff       	callq  2210 <__errno_location@plt>
    3139:	83 38 04             	cmpl   $0x4,(%rax)
    313c:	75 53                	jne    3191 <rio_readlineb+0x86>
    313e:	ba 00 20 00 00       	mov    $0x2000,%edx
    3143:	4c 89 e6             	mov    %r12,%rsi
    3146:	8b 3b                	mov    (%rbx),%edi
    3148:	e8 33 f1 ff ff       	callq  2280 <read@plt>
    314d:	89 c2                	mov    %eax,%edx
    314f:	89 43 04             	mov    %eax,0x4(%rbx)
    3152:	85 c0                	test   %eax,%eax
    3154:	78 de                	js     3134 <rio_readlineb+0x29>
    3156:	85 c0                	test   %eax,%eax
    3158:	74 40                	je     319a <rio_readlineb+0x8f>
    315a:	4c 89 63 08          	mov    %r12,0x8(%rbx)
    315e:	48 8b 43 08          	mov    0x8(%rbx),%rax
    3162:	0f b6 08             	movzbl (%rax),%ecx
    3165:	48 83 c0 01          	add    $0x1,%rax
    3169:	48 89 43 08          	mov    %rax,0x8(%rbx)
    316d:	83 ea 01             	sub    $0x1,%edx
    3170:	89 53 04             	mov    %edx,0x4(%rbx)
    3173:	48 83 c5 01          	add    $0x1,%rbp
    3177:	88 4d ff             	mov    %cl,-0x1(%rbp)
    317a:	80 f9 0a             	cmp    $0xa,%cl
    317d:	74 3c                	je     31bb <rio_readlineb+0xb0>
    317f:	41 83 c5 01          	add    $0x1,%r13d
    3183:	4c 39 f5             	cmp    %r14,%rbp
    3186:	74 30                	je     31b8 <rio_readlineb+0xad>
    3188:	8b 53 04             	mov    0x4(%rbx),%edx
    318b:	85 d2                	test   %edx,%edx
    318d:	7e af                	jle    313e <rio_readlineb+0x33>
    318f:	eb cd                	jmp    315e <rio_readlineb+0x53>
    3191:	48 c7 c0 ff ff ff ff 	mov    $0xffffffffffffffff,%rax
    3198:	eb 05                	jmp    319f <rio_readlineb+0x94>
    319a:	b8 00 00 00 00       	mov    $0x0,%eax
    319f:	85 c0                	test   %eax,%eax
    31a1:	75 28                	jne    31cb <rio_readlineb+0xc0>
    31a3:	b8 00 00 00 00       	mov    $0x0,%eax
    31a8:	41 83 fd 01          	cmp    $0x1,%r13d
    31ac:	75 0d                	jne    31bb <rio_readlineb+0xb0>
    31ae:	eb 12                	jmp    31c2 <rio_readlineb+0xb7>
    31b0:	41 bd 01 00 00 00    	mov    $0x1,%r13d
    31b6:	eb 03                	jmp    31bb <rio_readlineb+0xb0>
    31b8:	4c 89 f5             	mov    %r14,%rbp
    31bb:	c6 45 00 00          	movb   $0x0,0x0(%rbp)
    31bf:	49 63 c5             	movslq %r13d,%rax
    31c2:	5b                   	pop    %rbx
    31c3:	5d                   	pop    %rbp
    31c4:	41 5c                	pop    %r12
    31c6:	41 5d                	pop    %r13
    31c8:	41 5e                	pop    %r14
    31ca:	c3                   	retq   
    31cb:	48 c7 c0 ff ff ff ff 	mov    $0xffffffffffffffff,%rax
    31d2:	eb ee                	jmp    31c2 <rio_readlineb+0xb7>

00000000000031d4 <submitr>:
    31d4:	f3 0f 1e fa          	endbr64 
    31d8:	41 57                	push   %r15
    31da:	41 56                	push   %r14
    31dc:	41 55                	push   %r13
    31de:	41 54                	push   %r12
    31e0:	55                   	push   %rbp
    31e1:	53                   	push   %rbx
    31e2:	4c 8d 9c 24 00 60 ff 	lea    -0xa000(%rsp),%r11
    31e9:	ff 
    31ea:	48 81 ec 00 10 00 00 	sub    $0x1000,%rsp
    31f1:	48 83 0c 24 00       	orq    $0x0,(%rsp)
    31f6:	4c 39 dc             	cmp    %r11,%rsp
    31f9:	75 ef                	jne    31ea <submitr+0x16>
    31fb:	48 83 ec 68          	sub    $0x68,%rsp
    31ff:	48 89 fd             	mov    %rdi,%rbp
    3202:	41 89 f5             	mov    %esi,%r13d
    3205:	48 89 54 24 08       	mov    %rdx,0x8(%rsp)
    320a:	48 89 4c 24 10       	mov    %rcx,0x10(%rsp)
    320f:	4c 89 44 24 18       	mov    %r8,0x18(%rsp)
    3214:	4c 89 cb             	mov    %r9,%rbx
    3217:	4c 8b bc 24 a0 a0 00 	mov    0xa0a0(%rsp),%r15
    321e:	00 
    321f:	64 48 8b 04 25 28 00 	mov    %fs:0x28,%rax
    3226:	00 00 
    3228:	48 89 84 24 58 a0 00 	mov    %rax,0xa058(%rsp)
    322f:	00 
    3230:	31 c0                	xor    %eax,%eax
    3232:	c7 44 24 2c 00 00 00 	movl   $0x0,0x2c(%rsp)
    3239:	00 
    323a:	ba 00 00 00 00       	mov    $0x0,%edx
    323f:	be 01 00 00 00       	mov    $0x1,%esi
    3244:	bf 02 00 00 00       	mov    $0x2,%edi
    3249:	e8 42 f1 ff ff       	callq  2390 <socket@plt>
    324e:	85 c0                	test   %eax,%eax
    3250:	0f 88 1a 01 00 00    	js     3370 <submitr+0x19c>
    3256:	41 89 c4             	mov    %eax,%r12d
    3259:	48 89 ef             	mov    %rbp,%rdi
    325c:	e8 4f f0 ff ff       	callq  22b0 <gethostbyname@plt>
    3261:	48 85 c0             	test   %rax,%rax
    3264:	0f 84 56 01 00 00    	je     33c0 <submitr+0x1ec>
    326a:	48 8d 6c 24 30       	lea    0x30(%rsp),%rbp
    326f:	48 c7 44 24 30 00 00 	movq   $0x0,0x30(%rsp)
    3276:	00 00 
    3278:	48 c7 44 24 38 00 00 	movq   $0x0,0x38(%rsp)
    327f:	00 00 
    3281:	66 c7 44 24 30 02 00 	movw   $0x2,0x30(%rsp)
    3288:	48 63 50 14          	movslq 0x14(%rax),%rdx
    328c:	48 8b 40 18          	mov    0x18(%rax),%rax
    3290:	48 8d 7c 24 34       	lea    0x34(%rsp),%rdi
    3295:	b9 0c 00 00 00       	mov    $0xc,%ecx
    329a:	48 8b 30             	mov    (%rax),%rsi
    329d:	e8 1e f0 ff ff       	callq  22c0 <__memmove_chk@plt>
    32a2:	66 41 c1 c5 08       	rol    $0x8,%r13w
    32a7:	66 44 89 6c 24 32    	mov    %r13w,0x32(%rsp)
    32ad:	ba 10 00 00 00       	mov    $0x10,%edx
    32b2:	48 89 ee             	mov    %rbp,%rsi
    32b5:	44 89 e7             	mov    %r12d,%edi
    32b8:	e8 83 f0 ff ff       	callq  2340 <connect@plt>
    32bd:	85 c0                	test   %eax,%eax
    32bf:	0f 88 66 01 00 00    	js     342b <submitr+0x257>
    32c5:	49 c7 c1 ff ff ff ff 	mov    $0xffffffffffffffff,%r9
    32cc:	b8 00 00 00 00       	mov    $0x0,%eax
    32d1:	4c 89 c9             	mov    %r9,%rcx
    32d4:	48 89 df             	mov    %rbx,%rdi
    32d7:	f2 ae                	repnz scas %es:(%rdi),%al
    32d9:	48 f7 d1             	not    %rcx
    32dc:	48 89 ce             	mov    %rcx,%rsi
    32df:	4c 89 c9             	mov    %r9,%rcx
    32e2:	48 8b 7c 24 08       	mov    0x8(%rsp),%rdi
    32e7:	f2 ae                	repnz scas %es:(%rdi),%al
    32e9:	49 89 c8             	mov    %rcx,%r8
    32ec:	4c 89 c9             	mov    %r9,%rcx
    32ef:	48 8b 7c 24 10       	mov    0x10(%rsp),%rdi
    32f4:	f2 ae                	repnz scas %es:(%rdi),%al
    32f6:	48 89 ca             	mov    %rcx,%rdx
    32f9:	48 f7 d2             	not    %rdx
    32fc:	4c 89 c9             	mov    %r9,%rcx
    32ff:	48 8b 7c 24 18       	mov    0x18(%rsp),%rdi
    3304:	f2 ae                	repnz scas %es:(%rdi),%al
    3306:	4c 29 c2             	sub    %r8,%rdx
    3309:	48 29 ca             	sub    %rcx,%rdx
    330c:	48 8d 44 76 fd       	lea    -0x3(%rsi,%rsi,2),%rax
    3311:	48 8d 44 02 7b       	lea    0x7b(%rdx,%rax,1),%rax
    3316:	48 3d 00 20 00 00    	cmp    $0x2000,%rax
    331c:	0f 87 66 01 00 00    	ja     3488 <submitr+0x2b4>
    3322:	48 8d 94 24 50 40 00 	lea    0x4050(%rsp),%rdx
    3329:	00 
    332a:	b9 00 04 00 00       	mov    $0x400,%ecx
    332f:	b8 00 00 00 00       	mov    $0x0,%eax
    3334:	48 89 d7             	mov    %rdx,%rdi
    3337:	f3 48 ab             	rep stos %rax,%es:(%rdi)
    333a:	48 c7 c1 ff ff ff ff 	mov    $0xffffffffffffffff,%rcx
    3341:	48 89 df             	mov    %rbx,%rdi
    3344:	f2 ae                	repnz scas %es:(%rdi),%al
    3346:	48 f7 d1             	not    %rcx
    3349:	48 8d 41 ff          	lea    -0x1(%rcx),%rax
    334d:	83 f9 01             	cmp    $0x1,%ecx
    3350:	0f 84 08 05 00 00    	je     385e <submitr+0x68a>
    3356:	8d 40 ff             	lea    -0x1(%rax),%eax
    3359:	4c 8d 74 03 01       	lea    0x1(%rbx,%rax,1),%r14
    335e:	48 89 d5             	mov    %rdx,%rbp
    3361:	49 bd d9 ff 00 00 00 	movabs $0x2000000000ffd9,%r13
    3368:	00 20 00 
    336b:	e9 a6 01 00 00       	jmpq   3516 <submitr+0x342>
    3370:	48 b8 45 72 72 6f 72 	movabs $0x43203a726f727245,%rax
    3377:	3a 20 43 
    337a:	48 ba 6c 69 65 6e 74 	movabs $0x6e7520746e65696c,%rdx
    3381:	20 75 6e 
    3384:	49 89 07             	mov    %rax,(%r15)
    3387:	49 89 57 08          	mov    %rdx,0x8(%r15)
    338b:	48 b8 61 62 6c 65 20 	movabs $0x206f7420656c6261,%rax
    3392:	74 6f 20 
    3395:	48 ba 63 72 65 61 74 	movabs $0x7320657461657263,%rdx
    339c:	65 20 73 
    339f:	49 89 47 10          	mov    %rax,0x10(%r15)
    33a3:	49 89 57 18          	mov    %rdx,0x18(%r15)
    33a7:	41 c7 47 20 6f 63 6b 	movl   $0x656b636f,0x20(%r15)
    33ae:	65 
    33af:	66 41 c7 47 24 74 00 	movw   $0x74,0x24(%r15)
    33b6:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    33bb:	e9 16 03 00 00       	jmpq   36d6 <submitr+0x502>
    33c0:	48 b8 45 72 72 6f 72 	movabs $0x44203a726f727245,%rax
    33c7:	3a 20 44 
    33ca:	48 ba 4e 53 20 69 73 	movabs $0x6e7520736920534e,%rdx
    33d1:	20 75 6e 
    33d4:	49 89 07             	mov    %rax,(%r15)
    33d7:	49 89 57 08          	mov    %rdx,0x8(%r15)
    33db:	48 b8 61 62 6c 65 20 	movabs $0x206f7420656c6261,%rax
    33e2:	74 6f 20 
    33e5:	48 ba 72 65 73 6f 6c 	movabs $0x2065766c6f736572,%rdx
    33ec:	76 65 20 
    33ef:	49 89 47 10          	mov    %rax,0x10(%r15)
    33f3:	49 89 57 18          	mov    %rdx,0x18(%r15)
    33f7:	48 b8 73 65 72 76 65 	movabs $0x6120726576726573,%rax
    33fe:	72 20 61 
    3401:	49 89 47 20          	mov    %rax,0x20(%r15)
    3405:	41 c7 47 28 64 64 72 	movl   $0x65726464,0x28(%r15)
    340c:	65 
    340d:	66 41 c7 47 2c 73 73 	movw   $0x7373,0x2c(%r15)
    3414:	41 c6 47 2e 00       	movb   $0x0,0x2e(%r15)
    3419:	44 89 e7             	mov    %r12d,%edi
    341c:	e8 4f ee ff ff       	callq  2270 <close@plt>
    3421:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    3426:	e9 ab 02 00 00       	jmpq   36d6 <submitr+0x502>
    342b:	48 b8 45 72 72 6f 72 	movabs $0x55203a726f727245,%rax
    3432:	3a 20 55 
    3435:	48 ba 6e 61 62 6c 65 	movabs $0x6f7420656c62616e,%rdx
    343c:	20 74 6f 
    343f:	49 89 07             	mov    %rax,(%r15)
    3442:	49 89 57 08          	mov    %rdx,0x8(%r15)
    3446:	48 b8 20 63 6f 6e 6e 	movabs $0x7463656e6e6f6320,%rax
    344d:	65 63 74 
    3450:	48 ba 20 74 6f 20 74 	movabs $0x20656874206f7420,%rdx
    3457:	68 65 20 
    345a:	49 89 47 10          	mov    %rax,0x10(%r15)
    345e:	49 89 57 18          	mov    %rdx,0x18(%r15)
    3462:	41 c7 47 20 73 65 72 	movl   $0x76726573,0x20(%r15)
    3469:	76 
    346a:	66 41 c7 47 24 65 72 	movw   $0x7265,0x24(%r15)
    3471:	41 c6 47 26 00       	movb   $0x0,0x26(%r15)
    3476:	44 89 e7             	mov    %r12d,%edi
    3479:	e8 f2 ed ff ff       	callq  2270 <close@plt>
    347e:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    3483:	e9 4e 02 00 00       	jmpq   36d6 <submitr+0x502>
    3488:	48 b8 45 72 72 6f 72 	movabs $0x52203a726f727245,%rax
    348f:	3a 20 52 
    3492:	48 ba 65 73 75 6c 74 	movabs $0x747320746c757365,%rdx
    3499:	20 73 74 
    349c:	49 89 07             	mov    %rax,(%r15)
    349f:	49 89 57 08          	mov    %rdx,0x8(%r15)
    34a3:	48 b8 72 69 6e 67 20 	movabs $0x6f6f7420676e6972,%rax
    34aa:	74 6f 6f 
    34ad:	48 ba 20 6c 61 72 67 	movabs $0x202e656772616c20,%rdx
    34b4:	65 2e 20 
    34b7:	49 89 47 10          	mov    %rax,0x10(%r15)
    34bb:	49 89 57 18          	mov    %rdx,0x18(%r15)
    34bf:	48 b8 49 6e 63 72 65 	movabs $0x6573616572636e49,%rax
    34c6:	61 73 65 
    34c9:	48 ba 20 53 55 42 4d 	movabs $0x5254494d42555320,%rdx
    34d0:	49 54 52 
    34d3:	49 89 47 20          	mov    %rax,0x20(%r15)
    34d7:	49 89 57 28          	mov    %rdx,0x28(%r15)
    34db:	48 b8 5f 4d 41 58 42 	movabs $0x46554258414d5f,%rax
    34e2:	55 46 00 
    34e5:	49 89 47 30          	mov    %rax,0x30(%r15)
    34e9:	44 89 e7             	mov    %r12d,%edi
    34ec:	e8 7f ed ff ff       	callq  2270 <close@plt>
    34f1:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    34f6:	e9 db 01 00 00       	jmpq   36d6 <submitr+0x502>
    34fb:	49 0f a3 c5          	bt     %rax,%r13
    34ff:	73 21                	jae    3522 <submitr+0x34e>
    3501:	44 88 45 00          	mov    %r8b,0x0(%rbp)
    3505:	48 8d 6d 01          	lea    0x1(%rbp),%rbp
    3509:	48 83 c3 01          	add    $0x1,%rbx
    350d:	4c 39 f3             	cmp    %r14,%rbx
    3510:	0f 84 48 03 00 00    	je     385e <submitr+0x68a>
    3516:	44 0f b6 03          	movzbl (%rbx),%r8d
    351a:	41 8d 40 d6          	lea    -0x2a(%r8),%eax
    351e:	3c 35                	cmp    $0x35,%al
    3520:	76 d9                	jbe    34fb <submitr+0x327>
    3522:	44 89 c0             	mov    %r8d,%eax
    3525:	83 e0 df             	and    $0xffffffdf,%eax
    3528:	83 e8 41             	sub    $0x41,%eax
    352b:	3c 19                	cmp    $0x19,%al
    352d:	76 d2                	jbe    3501 <submitr+0x32d>
    352f:	41 80 f8 20          	cmp    $0x20,%r8b
    3533:	74 63                	je     3598 <submitr+0x3c4>
    3535:	41 8d 40 e0          	lea    -0x20(%r8),%eax
    3539:	3c 5f                	cmp    $0x5f,%al
    353b:	76 0a                	jbe    3547 <submitr+0x373>
    353d:	41 80 f8 09          	cmp    $0x9,%r8b
    3541:	0f 85 8a 02 00 00    	jne    37d1 <submitr+0x5fd>
    3547:	48 8d bc 24 50 80 00 	lea    0x8050(%rsp),%rdi
    354e:	00 
    354f:	45 0f b6 c0          	movzbl %r8b,%r8d
    3553:	48 8d 0d dc 14 00 00 	lea    0x14dc(%rip),%rcx        # 4a36 <array.3473+0x856>
    355a:	ba 08 00 00 00       	mov    $0x8,%edx
    355f:	be 01 00 00 00       	mov    $0x1,%esi
    3564:	b8 00 00 00 00       	mov    $0x0,%eax
    3569:	e8 12 ee ff ff       	callq  2380 <__sprintf_chk@plt>
    356e:	0f b6 84 24 50 80 00 	movzbl 0x8050(%rsp),%eax
    3575:	00 
    3576:	88 45 00             	mov    %al,0x0(%rbp)
    3579:	0f b6 84 24 51 80 00 	movzbl 0x8051(%rsp),%eax
    3580:	00 
    3581:	88 45 01             	mov    %al,0x1(%rbp)
    3584:	0f b6 84 24 52 80 00 	movzbl 0x8052(%rsp),%eax
    358b:	00 
    358c:	88 45 02             	mov    %al,0x2(%rbp)
    358f:	48 8d 6d 03          	lea    0x3(%rbp),%rbp
    3593:	e9 71 ff ff ff       	jmpq   3509 <submitr+0x335>
    3598:	c6 45 00 2b          	movb   $0x2b,0x0(%rbp)
    359c:	48 8d 6d 01          	lea    0x1(%rbp),%rbp
    35a0:	e9 64 ff ff ff       	jmpq   3509 <submitr+0x335>
    35a5:	48 01 c5             	add    %rax,%rbp
    35a8:	48 29 c3             	sub    %rax,%rbx
    35ab:	0f 84 1d 03 00 00    	je     38ce <submitr+0x6fa>
    35b1:	48 89 da             	mov    %rbx,%rdx
    35b4:	48 89 ee             	mov    %rbp,%rsi
    35b7:	44 89 e7             	mov    %r12d,%edi
    35ba:	e8 81 ec ff ff       	callq  2240 <write@plt>
    35bf:	48 85 c0             	test   %rax,%rax
    35c2:	7f e1                	jg     35a5 <submitr+0x3d1>
    35c4:	e8 47 ec ff ff       	callq  2210 <__errno_location@plt>
    35c9:	83 38 04             	cmpl   $0x4,(%rax)
    35cc:	0f 85 a0 01 00 00    	jne    3772 <submitr+0x59e>
    35d2:	4c 89 e8             	mov    %r13,%rax
    35d5:	eb ce                	jmp    35a5 <submitr+0x3d1>
    35d7:	48 b8 45 72 72 6f 72 	movabs $0x43203a726f727245,%rax
    35de:	3a 20 43 
    35e1:	48 ba 6c 69 65 6e 74 	movabs $0x6e7520746e65696c,%rdx
    35e8:	20 75 6e 
    35eb:	49 89 07             	mov    %rax,(%r15)
    35ee:	49 89 57 08          	mov    %rdx,0x8(%r15)
    35f2:	48 b8 61 62 6c 65 20 	movabs $0x206f7420656c6261,%rax
    35f9:	74 6f 20 
    35fc:	48 ba 72 65 61 64 20 	movabs $0x7269662064616572,%rdx
    3603:	66 69 72 
    3606:	49 89 47 10          	mov    %rax,0x10(%r15)
    360a:	49 89 57 18          	mov    %rdx,0x18(%r15)
    360e:	48 b8 73 74 20 68 65 	movabs $0x6564616568207473,%rax
    3615:	61 64 65 
    3618:	48 ba 72 20 66 72 6f 	movabs $0x73206d6f72662072,%rdx
    361f:	6d 20 73 
    3622:	49 89 47 20          	mov    %rax,0x20(%r15)
    3626:	49 89 57 28          	mov    %rdx,0x28(%r15)
    362a:	41 c7 47 30 65 72 76 	movl   $0x65767265,0x30(%r15)
    3631:	65 
    3632:	66 41 c7 47 34 72 00 	movw   $0x72,0x34(%r15)
    3639:	44 89 e7             	mov    %r12d,%edi
    363c:	e8 2f ec ff ff       	callq  2270 <close@plt>
    3641:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    3646:	e9 8b 00 00 00       	jmpq   36d6 <submitr+0x502>
    364b:	4c 8d 8c 24 50 80 00 	lea    0x8050(%rsp),%r9
    3652:	00 
    3653:	48 8d 0d 36 13 00 00 	lea    0x1336(%rip),%rcx        # 4990 <array.3473+0x7b0>
    365a:	48 c7 c2 ff ff ff ff 	mov    $0xffffffffffffffff,%rdx
    3661:	be 01 00 00 00       	mov    $0x1,%esi
    3666:	4c 89 ff             	mov    %r15,%rdi
    3669:	b8 00 00 00 00       	mov    $0x0,%eax
    366e:	e8 0d ed ff ff       	callq  2380 <__sprintf_chk@plt>
    3673:	44 89 e7             	mov    %r12d,%edi
    3676:	e8 f5 eb ff ff       	callq  2270 <close@plt>
    367b:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    3680:	eb 54                	jmp    36d6 <submitr+0x502>
    3682:	48 8d b4 24 50 20 00 	lea    0x2050(%rsp),%rsi
    3689:	00 
    368a:	48 8d 7c 24 40       	lea    0x40(%rsp),%rdi
    368f:	ba 00 20 00 00       	mov    $0x2000,%edx
    3694:	e8 72 fa ff ff       	callq  310b <rio_readlineb>
    3699:	48 85 c0             	test   %rax,%rax
    369c:	7e 61                	jle    36ff <submitr+0x52b>
    369e:	48 8d b4 24 50 20 00 	lea    0x2050(%rsp),%rsi
    36a5:	00 
    36a6:	4c 89 ff             	mov    %r15,%rdi
    36a9:	e8 72 eb ff ff       	callq  2220 <strcpy@plt>
    36ae:	44 89 e7             	mov    %r12d,%edi
    36b1:	e8 ba eb ff ff       	callq  2270 <close@plt>
    36b6:	b9 03 00 00 00       	mov    $0x3,%ecx
    36bb:	48 8d 3d 8f 13 00 00 	lea    0x138f(%rip),%rdi        # 4a51 <array.3473+0x871>
    36c2:	4c 89 fe             	mov    %r15,%rsi
    36c5:	f3 a6                	repz cmpsb %es:(%rdi),%ds:(%rsi)
    36c7:	0f 97 c0             	seta   %al
    36ca:	1c 00                	sbb    $0x0,%al
    36cc:	84 c0                	test   %al,%al
    36ce:	0f 95 c0             	setne  %al
    36d1:	0f b6 c0             	movzbl %al,%eax
    36d4:	f7 d8                	neg    %eax
    36d6:	48 8b 94 24 58 a0 00 	mov    0xa058(%rsp),%rdx
    36dd:	00 
    36de:	64 48 33 14 25 28 00 	xor    %fs:0x28,%rdx
    36e5:	00 00 
    36e7:	0f 85 04 03 00 00    	jne    39f1 <submitr+0x81d>
    36ed:	48 81 c4 68 a0 00 00 	add    $0xa068,%rsp
    36f4:	5b                   	pop    %rbx
    36f5:	5d                   	pop    %rbp
    36f6:	41 5c                	pop    %r12
    36f8:	41 5d                	pop    %r13
    36fa:	41 5e                	pop    %r14
    36fc:	41 5f                	pop    %r15
    36fe:	c3                   	retq   
    36ff:	48 b8 45 72 72 6f 72 	movabs $0x43203a726f727245,%rax
    3706:	3a 20 43 
    3709:	48 ba 6c 69 65 6e 74 	movabs $0x6e7520746e65696c,%rdx
    3710:	20 75 6e 
    3713:	49 89 07             	mov    %rax,(%r15)
    3716:	49 89 57 08          	mov    %rdx,0x8(%r15)
    371a:	48 b8 61 62 6c 65 20 	movabs $0x206f7420656c6261,%rax
    3721:	74 6f 20 
    3724:	48 ba 72 65 61 64 20 	movabs $0x6174732064616572,%rdx
    372b:	73 74 61 
    372e:	49 89 47 10          	mov    %rax,0x10(%r15)
    3732:	49 89 57 18          	mov    %rdx,0x18(%r15)
    3736:	48 b8 74 75 73 20 6d 	movabs $0x7373656d20737574,%rax
    373d:	65 73 73 
    3740:	48 ba 61 67 65 20 66 	movabs $0x6d6f726620656761,%rdx
    3747:	72 6f 6d 
    374a:	49 89 47 20          	mov    %rax,0x20(%r15)
    374e:	49 89 57 28          	mov    %rdx,0x28(%r15)
    3752:	48 b8 20 73 65 72 76 	movabs $0x72657672657320,%rax
    3759:	65 72 00 
    375c:	49 89 47 30          	mov    %rax,0x30(%r15)
    3760:	44 89 e7             	mov    %r12d,%edi
    3763:	e8 08 eb ff ff       	callq  2270 <close@plt>
    3768:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    376d:	e9 64 ff ff ff       	jmpq   36d6 <submitr+0x502>
    3772:	48 b8 45 72 72 6f 72 	movabs $0x43203a726f727245,%rax
    3779:	3a 20 43 
    377c:	48 ba 6c 69 65 6e 74 	movabs $0x6e7520746e65696c,%rdx
    3783:	20 75 6e 
    3786:	49 89 07             	mov    %rax,(%r15)
    3789:	49 89 57 08          	mov    %rdx,0x8(%r15)
    378d:	48 b8 61 62 6c 65 20 	movabs $0x206f7420656c6261,%rax
    3794:	74 6f 20 
    3797:	48 ba 77 72 69 74 65 	movabs $0x6f74206574697277,%rdx
    379e:	20 74 6f 
    37a1:	49 89 47 10          	mov    %rax,0x10(%r15)
    37a5:	49 89 57 18          	mov    %rdx,0x18(%r15)
    37a9:	48 b8 20 74 68 65 20 	movabs $0x7265732065687420,%rax
    37b0:	73 65 72 
    37b3:	49 89 47 20          	mov    %rax,0x20(%r15)
    37b7:	41 c7 47 28 76 65 72 	movl   $0x726576,0x28(%r15)
    37be:	00 
    37bf:	44 89 e7             	mov    %r12d,%edi
    37c2:	e8 a9 ea ff ff       	callq  2270 <close@plt>
    37c7:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    37cc:	e9 05 ff ff ff       	jmpq   36d6 <submitr+0x502>
    37d1:	48 b8 45 72 72 6f 72 	movabs $0x52203a726f727245,%rax
    37d8:	3a 20 52 
    37db:	48 ba 65 73 75 6c 74 	movabs $0x747320746c757365,%rdx
    37e2:	20 73 74 
    37e5:	49 89 07             	mov    %rax,(%r15)
    37e8:	49 89 57 08          	mov    %rdx,0x8(%r15)
    37ec:	48 b8 72 69 6e 67 20 	movabs $0x6e6f6320676e6972,%rax
    37f3:	63 6f 6e 
    37f6:	48 ba 74 61 69 6e 73 	movabs $0x6e6120736e696174,%rdx
    37fd:	20 61 6e 
    3800:	49 89 47 10          	mov    %rax,0x10(%r15)
    3804:	49 89 57 18          	mov    %rdx,0x18(%r15)
    3808:	48 b8 20 69 6c 6c 65 	movabs $0x6c6167656c6c6920,%rax
    380f:	67 61 6c 
    3812:	48 ba 20 6f 72 20 75 	movabs $0x72706e7520726f20,%rdx
    3819:	6e 70 72 
    381c:	49 89 47 20          	mov    %rax,0x20(%r15)
    3820:	49 89 57 28          	mov    %rdx,0x28(%r15)
    3824:	48 b8 69 6e 74 61 62 	movabs $0x20656c6261746e69,%rax
    382b:	6c 65 20 
    382e:	48 ba 63 68 61 72 61 	movabs $0x6574636172616863,%rdx
    3835:	63 74 65 
    3838:	49 89 47 30          	mov    %rax,0x30(%r15)
    383c:	49 89 57 38          	mov    %rdx,0x38(%r15)
    3840:	66 41 c7 47 40 72 2e 	movw   $0x2e72,0x40(%r15)
    3847:	41 c6 47 42 00       	movb   $0x0,0x42(%r15)
    384c:	44 89 e7             	mov    %r12d,%edi
    384f:	e8 1c ea ff ff       	callq  2270 <close@plt>
    3854:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    3859:	e9 78 fe ff ff       	jmpq   36d6 <submitr+0x502>
    385e:	48 8d ac 24 50 20 00 	lea    0x2050(%rsp),%rbp
    3865:	00 
    3866:	48 8d 84 24 50 40 00 	lea    0x4050(%rsp),%rax
    386d:	00 
    386e:	50                   	push   %rax
    386f:	ff 74 24 20          	pushq  0x20(%rsp)
    3873:	4c 8b 4c 24 20       	mov    0x20(%rsp),%r9
    3878:	4c 8b 44 24 18       	mov    0x18(%rsp),%r8
    387d:	48 8d 0d 3c 11 00 00 	lea    0x113c(%rip),%rcx        # 49c0 <array.3473+0x7e0>
    3884:	ba 00 20 00 00       	mov    $0x2000,%edx
    3889:	be 01 00 00 00       	mov    $0x1,%esi
    388e:	48 89 ef             	mov    %rbp,%rdi
    3891:	b8 00 00 00 00       	mov    $0x0,%eax
    3896:	e8 e5 ea ff ff       	callq  2380 <__sprintf_chk@plt>
    389b:	48 c7 c1 ff ff ff ff 	mov    $0xffffffffffffffff,%rcx
    38a2:	b8 00 00 00 00       	mov    $0x0,%eax
    38a7:	48 89 ef             	mov    %rbp,%rdi
    38aa:	f2 ae                	repnz scas %es:(%rdi),%al
    38ac:	48 f7 d1             	not    %rcx
    38af:	48 83 c4 10          	add    $0x10,%rsp
    38b3:	48 8d ac 24 50 20 00 	lea    0x2050(%rsp),%rbp
    38ba:	00 
    38bb:	41 bd 00 00 00 00    	mov    $0x0,%r13d
    38c1:	48 89 cb             	mov    %rcx,%rbx
    38c4:	48 83 eb 01          	sub    $0x1,%rbx
    38c8:	0f 85 e3 fc ff ff    	jne    35b1 <submitr+0x3dd>
    38ce:	44 89 64 24 40       	mov    %r12d,0x40(%rsp)
    38d3:	c7 44 24 44 00 00 00 	movl   $0x0,0x44(%rsp)
    38da:	00 
    38db:	48 8d 7c 24 40       	lea    0x40(%rsp),%rdi
    38e0:	48 8d 44 24 50       	lea    0x50(%rsp),%rax
    38e5:	48 89 44 24 48       	mov    %rax,0x48(%rsp)
    38ea:	48 8d b4 24 50 20 00 	lea    0x2050(%rsp),%rsi
    38f1:	00 
    38f2:	ba 00 20 00 00       	mov    $0x2000,%edx
    38f7:	e8 0f f8 ff ff       	callq  310b <rio_readlineb>
    38fc:	48 85 c0             	test   %rax,%rax
    38ff:	0f 8e d2 fc ff ff    	jle    35d7 <submitr+0x403>
    3905:	48 8d 4c 24 2c       	lea    0x2c(%rsp),%rcx
    390a:	48 8d 94 24 50 60 00 	lea    0x6050(%rsp),%rdx
    3911:	00 
    3912:	48 8d bc 24 50 20 00 	lea    0x2050(%rsp),%rdi
    3919:	00 
    391a:	4c 8d 84 24 50 80 00 	lea    0x8050(%rsp),%r8
    3921:	00 
    3922:	48 8d 35 14 11 00 00 	lea    0x1114(%rip),%rsi        # 4a3d <array.3473+0x85d>
    3929:	b8 00 00 00 00       	mov    $0x0,%eax
    392e:	e8 bd e9 ff ff       	callq  22f0 <__isoc99_sscanf@plt>
    3933:	44 8b 44 24 2c       	mov    0x2c(%rsp),%r8d
    3938:	41 81 f8 c8 00 00 00 	cmp    $0xc8,%r8d
    393f:	0f 85 06 fd ff ff    	jne    364b <submitr+0x477>
    3945:	48 8d 1d 02 11 00 00 	lea    0x1102(%rip),%rbx        # 4a4e <array.3473+0x86e>
    394c:	48 8d b4 24 50 20 00 	lea    0x2050(%rsp),%rsi
    3953:	00 
    3954:	b9 03 00 00 00       	mov    $0x3,%ecx
    3959:	48 89 df             	mov    %rbx,%rdi
    395c:	f3 a6                	repz cmpsb %es:(%rdi),%ds:(%rsi)
    395e:	0f 97 c0             	seta   %al
    3961:	1c 00                	sbb    $0x0,%al
    3963:	84 c0                	test   %al,%al
    3965:	0f 84 17 fd ff ff    	je     3682 <submitr+0x4ae>
    396b:	48 8d b4 24 50 20 00 	lea    0x2050(%rsp),%rsi
    3972:	00 
    3973:	48 8d 7c 24 40       	lea    0x40(%rsp),%rdi
    3978:	ba 00 20 00 00       	mov    $0x2000,%edx
    397d:	e8 89 f7 ff ff       	callq  310b <rio_readlineb>
    3982:	48 85 c0             	test   %rax,%rax
    3985:	7f c5                	jg     394c <submitr+0x778>
    3987:	48 b8 45 72 72 6f 72 	movabs $0x43203a726f727245,%rax
    398e:	3a 20 43 
    3991:	48 ba 6c 69 65 6e 74 	movabs $0x6e7520746e65696c,%rdx
    3998:	20 75 6e 
    399b:	49 89 07             	mov    %rax,(%r15)
    399e:	49 89 57 08          	mov    %rdx,0x8(%r15)
    39a2:	48 b8 61 62 6c 65 20 	movabs $0x206f7420656c6261,%rax
    39a9:	74 6f 20 
    39ac:	48 ba 72 65 61 64 20 	movabs $0x6165682064616572,%rdx
    39b3:	68 65 61 
    39b6:	49 89 47 10          	mov    %rax,0x10(%r15)
    39ba:	49 89 57 18          	mov    %rdx,0x18(%r15)
    39be:	48 b8 64 65 72 73 20 	movabs $0x6f72662073726564,%rax
    39c5:	66 72 6f 
    39c8:	48 ba 6d 20 73 65 72 	movabs $0x726576726573206d,%rdx
    39cf:	76 65 72 
    39d2:	49 89 47 20          	mov    %rax,0x20(%r15)
    39d6:	49 89 57 28          	mov    %rdx,0x28(%r15)
    39da:	41 c6 47 30 00       	movb   $0x0,0x30(%r15)
    39df:	44 89 e7             	mov    %r12d,%edi
    39e2:	e8 89 e8 ff ff       	callq  2270 <close@plt>
    39e7:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    39ec:	e9 e5 fc ff ff       	jmpq   36d6 <submitr+0x502>
    39f1:	e8 5a e8 ff ff       	callq  2250 <__stack_chk_fail@plt>

00000000000039f6 <init_timeout>:
    39f6:	f3 0f 1e fa          	endbr64 
    39fa:	85 ff                	test   %edi,%edi
    39fc:	75 01                	jne    39ff <init_timeout+0x9>
    39fe:	c3                   	retq   
    39ff:	53                   	push   %rbx
    3a00:	89 fb                	mov    %edi,%ebx
    3a02:	48 8d 35 cc f6 ff ff 	lea    -0x934(%rip),%rsi        # 30d5 <sigalrm_handler>
    3a09:	bf 0e 00 00 00       	mov    $0xe,%edi
    3a0e:	e8 8d e8 ff ff       	callq  22a0 <signal@plt>
    3a13:	85 db                	test   %ebx,%ebx
    3a15:	bf 00 00 00 00       	mov    $0x0,%edi
    3a1a:	0f 49 fb             	cmovns %ebx,%edi
    3a1d:	e8 3e e8 ff ff       	callq  2260 <alarm@plt>
    3a22:	5b                   	pop    %rbx
    3a23:	c3                   	retq   

0000000000003a24 <init_driver>:
    3a24:	f3 0f 1e fa          	endbr64 
    3a28:	41 54                	push   %r12
    3a2a:	55                   	push   %rbp
    3a2b:	53                   	push   %rbx
    3a2c:	48 83 ec 20          	sub    $0x20,%rsp
    3a30:	48 89 fd             	mov    %rdi,%rbp
    3a33:	64 48 8b 04 25 28 00 	mov    %fs:0x28,%rax
    3a3a:	00 00 
    3a3c:	48 89 44 24 18       	mov    %rax,0x18(%rsp)
    3a41:	31 c0                	xor    %eax,%eax
    3a43:	be 01 00 00 00       	mov    $0x1,%esi
    3a48:	bf 0d 00 00 00       	mov    $0xd,%edi
    3a4d:	e8 4e e8 ff ff       	callq  22a0 <signal@plt>
    3a52:	be 01 00 00 00       	mov    $0x1,%esi
    3a57:	bf 1d 00 00 00       	mov    $0x1d,%edi
    3a5c:	e8 3f e8 ff ff       	callq  22a0 <signal@plt>
    3a61:	be 01 00 00 00       	mov    $0x1,%esi
    3a66:	bf 1d 00 00 00       	mov    $0x1d,%edi
    3a6b:	e8 30 e8 ff ff       	callq  22a0 <signal@plt>
    3a70:	ba 00 00 00 00       	mov    $0x0,%edx
    3a75:	be 01 00 00 00       	mov    $0x1,%esi
    3a7a:	bf 02 00 00 00       	mov    $0x2,%edi
    3a7f:	e8 0c e9 ff ff       	callq  2390 <socket@plt>
    3a84:	85 c0                	test   %eax,%eax
    3a86:	0f 88 9c 00 00 00    	js     3b28 <init_driver+0x104>
    3a8c:	89 c3                	mov    %eax,%ebx
    3a8e:	48 8d 3d bf 0f 00 00 	lea    0xfbf(%rip),%rdi        # 4a54 <array.3473+0x874>
    3a95:	e8 16 e8 ff ff       	callq  22b0 <gethostbyname@plt>
    3a9a:	48 85 c0             	test   %rax,%rax
    3a9d:	0f 84 d1 00 00 00    	je     3b74 <init_driver+0x150>
    3aa3:	49 89 e4             	mov    %rsp,%r12
    3aa6:	48 c7 04 24 00 00 00 	movq   $0x0,(%rsp)
    3aad:	00 
    3aae:	48 c7 44 24 08 00 00 	movq   $0x0,0x8(%rsp)
    3ab5:	00 00 
    3ab7:	66 c7 04 24 02 00    	movw   $0x2,(%rsp)
    3abd:	48 63 50 14          	movslq 0x14(%rax),%rdx
    3ac1:	48 8b 40 18          	mov    0x18(%rax),%rax
    3ac5:	48 8d 7c 24 04       	lea    0x4(%rsp),%rdi
    3aca:	b9 0c 00 00 00       	mov    $0xc,%ecx
    3acf:	48 8b 30             	mov    (%rax),%rsi
    3ad2:	e8 e9 e7 ff ff       	callq  22c0 <__memmove_chk@plt>
    3ad7:	66 c7 44 24 02 3b 6e 	movw   $0x6e3b,0x2(%rsp)
    3ade:	ba 10 00 00 00       	mov    $0x10,%edx
    3ae3:	4c 89 e6             	mov    %r12,%rsi
    3ae6:	89 df                	mov    %ebx,%edi
    3ae8:	e8 53 e8 ff ff       	callq  2340 <connect@plt>
    3aed:	85 c0                	test   %eax,%eax
    3aef:	0f 88 e7 00 00 00    	js     3bdc <init_driver+0x1b8>
    3af5:	89 df                	mov    %ebx,%edi
    3af7:	e8 74 e7 ff ff       	callq  2270 <close@plt>
    3afc:	66 c7 45 00 4f 4b    	movw   $0x4b4f,0x0(%rbp)
    3b02:	c6 45 02 00          	movb   $0x0,0x2(%rbp)
    3b06:	b8 00 00 00 00       	mov    $0x0,%eax
    3b0b:	48 8b 4c 24 18       	mov    0x18(%rsp),%rcx
    3b10:	64 48 33 0c 25 28 00 	xor    %fs:0x28,%rcx
    3b17:	00 00 
    3b19:	0f 85 f5 00 00 00    	jne    3c14 <init_driver+0x1f0>
    3b1f:	48 83 c4 20          	add    $0x20,%rsp
    3b23:	5b                   	pop    %rbx
    3b24:	5d                   	pop    %rbp
    3b25:	41 5c                	pop    %r12
    3b27:	c3                   	retq   
    3b28:	48 b8 45 72 72 6f 72 	movabs $0x43203a726f727245,%rax
    3b2f:	3a 20 43 
    3b32:	48 ba 6c 69 65 6e 74 	movabs $0x6e7520746e65696c,%rdx
    3b39:	20 75 6e 
    3b3c:	48 89 45 00          	mov    %rax,0x0(%rbp)
    3b40:	48 89 55 08          	mov    %rdx,0x8(%rbp)
    3b44:	48 b8 61 62 6c 65 20 	movabs $0x206f7420656c6261,%rax
    3b4b:	74 6f 20 
    3b4e:	48 ba 63 72 65 61 74 	movabs $0x7320657461657263,%rdx
    3b55:	65 20 73 
    3b58:	48 89 45 10          	mov    %rax,0x10(%rbp)
    3b5c:	48 89 55 18          	mov    %rdx,0x18(%rbp)
    3b60:	c7 45 20 6f 63 6b 65 	movl   $0x656b636f,0x20(%rbp)
    3b67:	66 c7 45 24 74 00    	movw   $0x74,0x24(%rbp)
    3b6d:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    3b72:	eb 97                	jmp    3b0b <init_driver+0xe7>
    3b74:	48 b8 45 72 72 6f 72 	movabs $0x44203a726f727245,%rax
    3b7b:	3a 20 44 
    3b7e:	48 ba 4e 53 20 69 73 	movabs $0x6e7520736920534e,%rdx
    3b85:	20 75 6e 
    3b88:	48 89 45 00          	mov    %rax,0x0(%rbp)
    3b8c:	48 89 55 08          	mov    %rdx,0x8(%rbp)
    3b90:	48 b8 61 62 6c 65 20 	movabs $0x206f7420656c6261,%rax
    3b97:	74 6f 20 
    3b9a:	48 ba 72 65 73 6f 6c 	movabs $0x2065766c6f736572,%rdx
    3ba1:	76 65 20 
    3ba4:	48 89 45 10          	mov    %rax,0x10(%rbp)
    3ba8:	48 89 55 18          	mov    %rdx,0x18(%rbp)
    3bac:	48 b8 73 65 72 76 65 	movabs $0x6120726576726573,%rax
    3bb3:	72 20 61 
    3bb6:	48 89 45 20          	mov    %rax,0x20(%rbp)
    3bba:	c7 45 28 64 64 72 65 	movl   $0x65726464,0x28(%rbp)
    3bc1:	66 c7 45 2c 73 73    	movw   $0x7373,0x2c(%rbp)
    3bc7:	c6 45 2e 00          	movb   $0x0,0x2e(%rbp)
    3bcb:	89 df                	mov    %ebx,%edi
    3bcd:	e8 9e e6 ff ff       	callq  2270 <close@plt>
    3bd2:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    3bd7:	e9 2f ff ff ff       	jmpq   3b0b <init_driver+0xe7>
    3bdc:	4c 8d 05 71 0e 00 00 	lea    0xe71(%rip),%r8        # 4a54 <array.3473+0x874>
    3be3:	48 8d 0d 26 0e 00 00 	lea    0xe26(%rip),%rcx        # 4a10 <array.3473+0x830>
    3bea:	48 c7 c2 ff ff ff ff 	mov    $0xffffffffffffffff,%rdx
    3bf1:	be 01 00 00 00       	mov    $0x1,%esi
    3bf6:	48 89 ef             	mov    %rbp,%rdi
    3bf9:	b8 00 00 00 00       	mov    $0x0,%eax
    3bfe:	e8 7d e7 ff ff       	callq  2380 <__sprintf_chk@plt>
    3c03:	89 df                	mov    %ebx,%edi
    3c05:	e8 66 e6 ff ff       	callq  2270 <close@plt>
    3c0a:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
    3c0f:	e9 f7 fe ff ff       	jmpq   3b0b <init_driver+0xe7>
    3c14:	e8 37 e6 ff ff       	callq  2250 <__stack_chk_fail@plt>

0000000000003c19 <driver_post>:
    3c19:	f3 0f 1e fa          	endbr64 
    3c1d:	53                   	push   %rbx
    3c1e:	48 89 cb             	mov    %rcx,%rbx
    3c21:	85 d2                	test   %edx,%edx
    3c23:	75 17                	jne    3c3c <driver_post+0x23>
    3c25:	48 85 ff             	test   %rdi,%rdi
    3c28:	74 05                	je     3c2f <driver_post+0x16>
    3c2a:	80 3f 00             	cmpb   $0x0,(%rdi)
    3c2d:	75 36                	jne    3c65 <driver_post+0x4c>
    3c2f:	66 c7 03 4f 4b       	movw   $0x4b4f,(%rbx)
    3c34:	c6 43 02 00          	movb   $0x0,0x2(%rbx)
    3c38:	89 d0                	mov    %edx,%eax
    3c3a:	5b                   	pop    %rbx
    3c3b:	c3                   	retq   
    3c3c:	48 89 f2             	mov    %rsi,%rdx
    3c3f:	48 8d 35 24 0e 00 00 	lea    0xe24(%rip),%rsi        # 4a6a <array.3473+0x88a>
    3c46:	bf 01 00 00 00       	mov    $0x1,%edi
    3c4b:	b8 00 00 00 00       	mov    $0x0,%eax
    3c50:	e8 ab e6 ff ff       	callq  2300 <__printf_chk@plt>
    3c55:	66 c7 03 4f 4b       	movw   $0x4b4f,(%rbx)
    3c5a:	c6 43 02 00          	movb   $0x0,0x2(%rbx)
    3c5e:	b8 00 00 00 00       	mov    $0x0,%eax
    3c63:	eb d5                	jmp    3c3a <driver_post+0x21>
    3c65:	48 83 ec 08          	sub    $0x8,%rsp
    3c69:	51                   	push   %rcx
    3c6a:	49 89 f1             	mov    %rsi,%r9
    3c6d:	4c 8d 05 0d 0e 00 00 	lea    0xe0d(%rip),%r8        # 4a81 <array.3473+0x8a1>
    3c74:	48 89 f9             	mov    %rdi,%rcx
    3c77:	48 8d 15 07 0e 00 00 	lea    0xe07(%rip),%rdx        # 4a85 <array.3473+0x8a5>
    3c7e:	be 6e 3b 00 00       	mov    $0x3b6e,%esi
    3c83:	48 8d 3d ca 0d 00 00 	lea    0xdca(%rip),%rdi        # 4a54 <array.3473+0x874>
    3c8a:	e8 45 f5 ff ff       	callq  31d4 <submitr>
    3c8f:	48 83 c4 10          	add    $0x10,%rsp
    3c93:	eb a5                	jmp    3c3a <driver_post+0x21>
    3c95:	66 2e 0f 1f 84 00 00 	nopw   %cs:0x0(%rax,%rax,1)
    3c9c:	00 00 00 
    3c9f:	90                   	nop

0000000000003ca0 <__libc_csu_init>:
    3ca0:	f3 0f 1e fa          	endbr64 
    3ca4:	41 57                	push   %r15
    3ca6:	4c 8d 3d 3b 30 00 00 	lea    0x303b(%rip),%r15        # 6ce8 <__frame_dummy_init_array_entry>
    3cad:	41 56                	push   %r14
    3caf:	49 89 d6             	mov    %rdx,%r14
    3cb2:	41 55                	push   %r13
    3cb4:	49 89 f5             	mov    %rsi,%r13
    3cb7:	41 54                	push   %r12
    3cb9:	41 89 fc             	mov    %edi,%r12d
    3cbc:	55                   	push   %rbp
    3cbd:	48 8d 2d 2c 30 00 00 	lea    0x302c(%rip),%rbp        # 6cf0 <__do_global_dtors_aux_fini_array_entry>
    3cc4:	53                   	push   %rbx
    3cc5:	4c 29 fd             	sub    %r15,%rbp
    3cc8:	48 83 ec 08          	sub    $0x8,%rsp
    3ccc:	e8 2f e3 ff ff       	callq  2000 <_init>
    3cd1:	48 c1 fd 03          	sar    $0x3,%rbp
    3cd5:	74 1f                	je     3cf6 <__libc_csu_init+0x56>
    3cd7:	31 db                	xor    %ebx,%ebx
    3cd9:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)
    3ce0:	4c 89 f2             	mov    %r14,%rdx
    3ce3:	4c 89 ee             	mov    %r13,%rsi
    3ce6:	44 89 e7             	mov    %r12d,%edi
    3ce9:	41 ff 14 df          	callq  *(%r15,%rbx,8)
    3ced:	48 83 c3 01          	add    $0x1,%rbx
    3cf1:	48 39 dd             	cmp    %rbx,%rbp
    3cf4:	75 ea                	jne    3ce0 <__libc_csu_init+0x40>
    3cf6:	48 83 c4 08          	add    $0x8,%rsp
    3cfa:	5b                   	pop    %rbx
    3cfb:	5d                   	pop    %rbp
    3cfc:	41 5c                	pop    %r12
    3cfe:	41 5d                	pop    %r13
    3d00:	41 5e                	pop    %r14
    3d02:	41 5f                	pop    %r15
    3d04:	c3                   	retq   
    3d05:	66 66 2e 0f 1f 84 00 	data16 nopw %cs:0x0(%rax,%rax,1)
    3d0c:	00 00 00 00 

0000000000003d10 <__libc_csu_fini>:
    3d10:	f3 0f 1e fa          	endbr64 
    3d14:	c3                   	retq   

Disassembly of section .fini:

0000000000003d18 <_fini>:
    3d18:	f3 0f 1e fa          	endbr64 
    3d1c:	48 83 ec 08          	sub    $0x8,%rsp
    3d20:	48 83 c4 08          	add    $0x8,%rsp
    3d24:	c3                   	retq   
