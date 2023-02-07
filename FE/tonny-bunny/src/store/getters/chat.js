export default {
    /*
        chat
    */
    getIsEnterRoom(state) {
        return state.chat.isEnterRoom;
    },
    getChatRoomInfo(state) {
        return state.chat.chatRoomInfo;
    },
    getChatUserSeq(state) {
        return state.chat.chatUserSeq;
    },
    getChatRoomList(state) {
        return state.chat.chatRoomList;
    },
};
