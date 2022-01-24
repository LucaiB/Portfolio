	global binarySearch

	section .text

	;; 1st param (rdi): pointer to an int array
	;; 2nd param (rsi): the beginning of the array
	;; 3rd param (rdx): the end of the array
	;; 4th param (rcx): target element to find
	;; return (rax): int index of the array that the target was found in; -1 if not found


binarySearch:
	xor rax, rax
	
find:
	cmp rsi, rdx		; if array is fully searched, then target not found
	jg err			; not found
	mov r8, rsi
	add r8, rdx 		; start+end
	shr r8, 1		; total/2 = midpoint
	push r8			; save midpoint value
	lea r8, [r8*4+rdi]	; mid * size of int + array pointer value
	cmp ecx, [r8]		; compare target and element at middle of array
	je  ret			; if equal return
	jl  low			; if less than, repeat with lower half of array
	jg  high		; if higher, repeat with upper half

low:
	pop rdx			; end = midpoint - 1
	dec rdx
	jmp find		; try to find with new array

high:
	pop rsi			; start = midpoint + 1
	inc rsi
	jmp find		; try to find with new array
	

err:
	mov rax, -1		; if not found return -1
	ret

ret:	
	pop rax
	ret
