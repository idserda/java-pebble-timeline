package nl.palolem.timeline.api.pin;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Icon {

	// Notifications
	NOTIFICATION_GENERIC,
	NOTIFICATION_REMINDER,
	NOTIFICATION_FLAG,
	NOTIFICATION_LIGHTHOUSE,

	// Generic
	GENERIC_EMAIL,
	GENERIC_SMS,
	GENERIC_WARNING,
	GENERIC_CONFIRMATION,
	GENERIC_QUESTION,

	// Weather
	PARTLY_CLOUDY,
	CLOUDY_DAY,
	LIGHT_SNOW,
	LIGHT_RAIN,
	HEAVY_RAIN,
	HEAVY_SNOW,
	IMELINE_WEATHER,
	TIMELINE_SUN,
	RAINING_AND_SNOWING,
	SUNRISE,
	SUNSET,

	// Timeline
	TIMELINE_MISSED_CALL,
	TIMELINE_CALENDAR,
	TIMELINE_SPORTS,

	// Sports
	TIMELINE_BASEBALL,
	AMERICAN_FOOTBALL,
	BASKETBALL,
	CRICKET_GAME,
	SOCCER_GAME,
	HOCKEY_GAME,

	// Action results
	RESULT_DISMISSED,
	RESULT_DELETED,
	RESULT_MUTE,
	RESULT_SENT,
	RESULT_FAILED,

	// Events
	STOCKS_EVENT,
	MUSIC_EVENT,
	BIRTHDAY_EVENT,
	NEWS_EVENT,
	SCHEDULED_EVENT,
	MOVIE_EVENT,
	NO_EVENTS,

	// Misc
	PAY_BILL,
	HOTEL_RESERVATION,
	TIDE_IS_HIGH,
	INCOMING_PHONE_CALL,
	DURING_PHONE_CALL,
	DURING_PHONE_CALL_CENTERED,
	DISMISSED_PHONE_CALL,
	CHECK_INTERNET_CONNECTION,
	GLUCOSE_MONITOR,
	ALARM_CLOCK,
	CAR_RENTAL,
	DINNER_RESERVATION,
	RADIO_SHOW,
	AUDIO_CASSETTE,
	SCHEDULED_FLIGHT,
	REACHED_FITNESS_GOAL,
	DAY_SEPARATOR,
	WATCH_DISCONNECTED,
	TV_SHOW,
	LOCATION,
	SETTINGS;

	private static final String DEFAULT_SCHEME = "system://images";

	@JsonValue
	public String toValue() {
		return String.format("%s/%s", DEFAULT_SCHEME, name());
	}

}