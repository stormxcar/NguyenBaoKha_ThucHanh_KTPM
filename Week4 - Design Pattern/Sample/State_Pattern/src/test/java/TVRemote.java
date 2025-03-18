import org.example.State;
import org.example.TVContext;
import org.example.TVStartState;
import org.example.TVStopState;

public class TVRemote {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();
        context.setState(tvStartState);
        context.doAction();
        context.setState(tvStopState);
        context.doAction();
    }
}
