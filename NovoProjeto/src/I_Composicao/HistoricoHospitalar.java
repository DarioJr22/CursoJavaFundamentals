package I_Composicao;

import java.util.ArrayList;
import java.util.Date;

public class HistoricoHospitalar {

    public String getHistDoenca() {
        return histDoenca;
    }

    public void setHistDoenca(String histDoenca) {
        this.histDoenca = histDoenca;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    private String histDoenca;
    private Date data;
}
