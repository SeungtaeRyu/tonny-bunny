import temp from "./getters/temp";
import account from "./getters/account";
import board from "./getters/board";
import tonny from "./getters/tonny";
import bunny from "./getters/bunny";
import common from "./getters/common";
import alert from "./getters/alert";

export default {
    // 각 파일 만들어서 모듈화 사용
    ...temp,
    ...account,
    ...board,
    ...tonny,
    ...bunny,
    ...common,
    ...alert,
};
