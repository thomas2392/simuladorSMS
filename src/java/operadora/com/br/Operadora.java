package operadora.com.br;

import br.edu.ifpb.tsi.pd.websocket.Chat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/operadora/{numero}")
public class Operadora {
    private static List<Linha> linhas = Collections.synchronizedList(new ArrayList<Linha>());
    
    //As linhas são cadastradas quando se conectam a primeira vez com o a operadora, com o saldo zerado.
    @OnOpen
    public void onOpen(Session ses, @PathParam("numero")String numero){
        Linha linha = new Linha(numero, 0);
        linhas.add(linha);
    }
    
    /*@OnMessage
    public void onMessage(Session session, String message) {
        try {
            session.getBasicRemote().sendText("Números cadastrados:");
            for(String numero: telefones){
                session.getBasicRemote().sendText(numero);
            }
        } catch (IOException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    @OnClose
    public void onClose(Session session) {
        //Ao encerrar a sessão setar o status da linha como false, ou seja o telefone está desconectado.
    }
    
}
