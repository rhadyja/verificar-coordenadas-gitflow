public class AreaClicavel {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public AreaClicavel(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public AreaClicavel(){

    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "(" + getX1() + "," + getY1()  + ")" + "," + "(" + getX2() + "," + getY2() + ")";
    }

    public String verificarAreaDoClique(List<AreaClicavel> imagemComAreasClicaveis, double x, double y){
        //receber uma lista no parametro
        /*verificar area por area que estará guardada numa  lista*/
        String result = "achei";
        for(int i = 0; i < imagemComAreasClicaveis.size(); i++){
            if(imagemComAreasClicaveis.consultar(i).getX1() < x && x < imagemComAreasClicaveis.consultar(i).getX2() && imagemComAreasClicaveis.consultar(i).getY1() < y && y < imagemComAreasClicaveis.consultar(i).getY2()){
                //System.out.println("Achei a area");
                //colocar a intent aqui, um getIntent()
                return result + imagemComAreasClicaveis.consultar(i);
            }
            else{
                //System.out.println("Não Achei a area");
                i++;
                if(imagemComAreasClicaveis.consultar(i).getX1() < x && x < imagemComAreasClicaveis.consultar(i).getX2() && imagemComAreasClicaveis.consultar(i).getY1() < y && y < imagemComAreasClicaveis.consultar(i).getY2()){
                    return result + imagemComAreasClicaveis.consultar(i);
                }
            }
        }
        return "n achei";
    }

    public String getHotFix(){
        return "hotfix";
    }
}
