package com.tonnybunny.domain.alert.entity;


import com.tonnybunny.common.CommonEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AlertSettingsEntity extends CommonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alert_settings_seq")
	private Long seq;

	private boolean isAll;
	private boolean isTonnyBunny;
	private boolean isCommunity;
	private boolean isChat;

	private Long userSeq;

}