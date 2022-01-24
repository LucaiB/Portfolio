	;; Made use of the stack to reduce memory accesses
	;; Used lea to add and mulitply in one instruction
	;; 	and used bit shifting to compute 3x+1 faster
	;; Reduced branching and the number of instructions

	global threexplusone

	section .text

threexplusone:
	xor rax, rax		; rax will serve as counter
	cmp rdi, 1		; compare int to 1
	je  ret			; if it equals 1 then return
	push rax		; push count onto stack to save it
	mov rax, rdi		; move int to register for odd/even check
	and rax, 1		; if last bit is 1 then it is odd
	jz  divide		; divide by 2 if zero flag is set
	jmp doit		; otherwise odd --> do 3x+1
doit:
	pop rax			; set rax back to counter
	lea rdi, [edi*2+edi+1]	; compute 3x+1
	call threexplusone	; reset
	inc rax			; increment counter
	jmp ret

divide:
	pop rax			; set rax back to counter
	shr rdi, 1		; divide by 2
	call threexplusone	; reset
	inc rax			; increment counter
	jmp ret
ret:
	ret
