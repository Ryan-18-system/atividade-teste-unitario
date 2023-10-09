package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    @Test
    public void NaoDeveAlterarMatriculaSemTer11Digitos(){
        Aluno aluno = new Aluno(1, "julio", 12, "12345678912", "123");
        Assertions.assertThrows(RuntimeException.class, () -> aluno.setMatricula("1234567"));
    }

    @Test
    public void NaoDeveAlterarMatriculaSeConterCaracterEspecial(){
        Aluno aluno = new Aluno(1, "julio", 12, "12345678912", "123");
        Assertions.assertThrows(RuntimeException.class, () -> aluno.setMatricula("123456789!@"));
    }


}
