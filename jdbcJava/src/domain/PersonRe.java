package domain;

import java.util.Date;

public record PersonRe(
        Long id, String userId, String userPw, String userName, String userEmail,
        String phone1, String phone2, byte age, String addr1, String addr2,
        Date regDate, Date modDate) {

}
