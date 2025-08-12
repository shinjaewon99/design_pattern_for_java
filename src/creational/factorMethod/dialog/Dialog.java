package creational.factorMethod.dialog;

import creational.factorMethod.Button;

public abstract class Dialog {

    public void renderWindow() {
        // 버튼 생성
        Button okButton = createButton();
        // 버튼 렌더링
        okButton.render();
    }

    // 팩토리 메서드
    protected abstract Button createButton();
}
