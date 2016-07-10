
procedure Hanoi(n: integer; source, dest, by: char);
Begin
    if (n=1) then
        writeln('Move the plate from ', source, ' to ', dest)
    else begin
        Hanoi(n-1, source, by, dest);
        writeln('Move the plate from ', source, ' to ', dest);
        Hanoi(n-1, by, dest, source);
    end;
End;
