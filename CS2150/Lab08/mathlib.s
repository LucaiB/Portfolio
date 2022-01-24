	global product
	global power	

	section .text

product:
	xor rax, rax		; clear register for return value

add:
	cmp rsi, 1		; if second int counter < 1
	jl  ret			; then, return final value
	dec rsi			; second int counter -1
	add rax, rdi		; else, add first int to register
	jmp add			; loop

ret:
	ret	

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

power:
	xor rax, rax		; clear return register
	mov rdx, rdi		; store base into 3rd register
	mov rcx, rsi		; store exponent into 4th register
	mov rsi, rdi		; store base into original exponent register
	
doit:
	cmp rcx, 1		; (power == 1)
	je end			; return base
	
	call product		; base * base
	mov rsi, rdx		; put original base back into 2nd register
	mov rdi, rax		; store product value into 1st register

	
	dec rcx			; decrement exponent acting as counter
	call doit		; power(base, power-1)
	

	ret
	
end:
	mov rax, rdi 		; move final value into return register
	ret
