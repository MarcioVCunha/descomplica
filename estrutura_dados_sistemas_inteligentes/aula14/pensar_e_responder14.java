import javax.swing.*;

class BIntNo {
    int valor;
    BIntNo esq, dir;

    BIntNo(int novoValor) {
        valor = novoValor;
    }
}

class ArvoreBinaria {
    public BIntNo Raiz;

    public BIntNo inserir(BIntNo arvore, int novoNo) {
        if (arvore == null) {
            return new BIntNo(novoNo);
        } else {
            if (novoNo < arvore.valor) {
                arvore.esq = inserir(arvore.esq, novoNo);
            } else {
                arvore.dir = inserir(arvore.dir, novoNo);
            }
        }

        return arvore;
    }

    public void inserirNo(int novoValor) {
        Raiz = inserir(Raiz, novoValor);
    }

    public void exibirEsquerdo(BIntNo arv) {
        if (arv != null) {
            exibirEsquerdo((arv.esq));
            System.out.println(arv.valor);
        }
    }

    public void exibirNoEsq() {
        exibirEsquerdo(Raiz);
    }

    public void exibirDireito(BIntNo arv) {
        if (arv != null) {
            exibirDireito((arv.dir));
            System.out.println(arv.valor);
        }
    }

    public void exibirNoDir() {
        exibirDireito(Raiz);
    }

    public void exibirNo() {
        exibirNoEsq();
        exibirRaiz();
        exibirNoDir();
    }

    public void exibirRaiz() {
        System.out.println("raiz " + Raiz.valor);
    }

    public void excluirNo(int item) {
        BIntNo tempNo, pai, filho, temp;

        tempNo = Raiz;
        pai = null;
        filho = Raiz;

        Integer tempNoValor = new Integer(tempNo.valor);

        while (tempNo != null && tempNoValor != null) {
            pai = tempNo;

            if (item < tempNo.valor) {
                tempNo = tempNo.esq;
            } else {
                tempNo = tempNo.dir;
            }

            if (tempNo == null) {
                System.out.println("Item não Localizado");
            }

            if (pai == null) {
                if (tempNo.dir == null) {
                    Raiz = tempNo.esq;
                } else {
                    if (tempNo.esq == null) {
                        Raiz = tempNo.dir;
                    } else {
                        for (temp = tempNo, filho = tempNo.esq; filho.dir != null; temp = filho, filho = filho.dir) {
                            System.out.println("?");
                        }

                        if (filho != tempNo.esq) {
                            temp.dir = filho.esq;
                            filho.esq = Raiz.esq;
                        }

                        filho.dir = Raiz.dir;
                        Raiz = filho;
                    }
                }
            } else {
                if (tempNo.dir == null) {
                    if (pai.esq == tempNo) {
                        pai.esq = tempNo.esq;
                    } else {
                        pai.dir = tempNo.esq;
                    }
                } else {
                    if (tempNo == null) {
                        if (pai.esq == tempNo) {
                            pai.esq = tempNo.dir;
                        } else {
                            pai.dir = tempNo.dir;
                        }
                    } else {
                        for (temp = tempNo, filho = tempNo.esq; filho.dir != null; temp = filho, filho = filho.dir) {
                            System.out.println("??");
                        }

                        if (filho != tempNo.esq) {
                            temp.dir = filho.esq;
                            filho.esq = temp.esq;
                        }

                        filho.dir = tempNo.dir;

                        if (pai.esq == tempNo) {
                            pai.esq = filho;
                        } else {
                            pai.dir = filho;
                        }
                    }
                }
            }
        }
    }
}

class teste {
    public static void main(String args[]) {
        int num;
        ArvoreBinaria arv = new ArvoreBinaria();

        num = Integer.parseInt(JOptionPane.showInputDialog("Dogote um valor inteiro"));
        arv.inserirNo(num);
        num = Integer.parseInt(JOptionPane.showInputDialog("Dogote um valor inteiro"));
        arv.inserirNo(num);
        num = Integer.parseInt(JOptionPane.showInputDialog("Dogote um valor inteiro"));
        arv.inserirNo(num);
        num = Integer.parseInt(JOptionPane.showInputDialog("Dogote um valor inteiro"));
        arv.inserirNo(num);
        num = Integer.parseInt(JOptionPane.showInputDialog("Dogote um valor inteiro"));
        arv.inserirNo(num);

        arv.exibirNo();
    }
}