	;; rdi, rsi, rdx, rcx, r8, r9
	global linearSearch

	section .text

	
	;; rdi is pointer to array
	;; rsi is size of array
	;; rdx is target int
linearSearch:

	xor rax, rax		; zero return location	
	xor rcx, rcx
	mov rcx, rdi		; move array pointer to free register
	
find:
	cmp rax, rsi		; if whole array is searched ret -1
	je  err			; not found
	cmp edx, [rcx]		; see if target == &a[i]
	je found		; found
	add rcx, 4		; next element in array is 4 bytes away
	inc rax			; increment index counter
	jmp find		; restart with new index count if not found
	
err:
	mov rax, -1		; ret -1 if not found
	ret
	
found:
	ret			; value of rax will be index of target value because it acted as a counter
