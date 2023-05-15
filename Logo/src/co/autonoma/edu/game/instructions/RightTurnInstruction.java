
package co.autonoma.edu.game.instructions;

import co.autonoma.edu.game.exceptions.NegativeAngleException;

/**
 *
 * @author izibr
 */
public class RightTurnInstruction extends Instruction{
    private int angle;
    public RightTurnInstruction() {
        super(1);
    }
    
    @Override
    public void setParameter(String parameter) {
        noParameterValidation(parameter);
        parametersValidation(parameter);
        int auxAngle = Integer.parseInt(parameter.split(" ")[1]);
        if (auxAngle >= 0) {
            this.angle = auxAngle;
        } else {
            throw new NegativeAngleException();
        }
    }

    public int getAngle() {
        return angle;
    }
}
