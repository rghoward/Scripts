package io.intercom.android.sdk.utilities;

import android.content.Context;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class TimeFormatter {
    private SimpleDateFormat absoluteDateFormatter;
    private SimpleDateFormat absoluteTimeFormatter;
    private final Context context;
    private final TimeProvider timeProvider;

    public TimeFormatter(Context context, TimeProvider timeProvider) {
        this.context = context;
        this.timeProvider = timeProvider;
    }

    public static String formatFromUtcTime(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        calendar.set(11, i);
        calendar.set(12, i2);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(time);
    }

    public static String formatTimeForTickets(long j, Context context) {
        Phrase phrasePut;
        Date date = new Date(j * 1000);
        long jCurrentTimeMillis = (System.currentTimeMillis() - date.getTime()) / 60000;
        long jCurrentTimeMillis2 = (System.currentTimeMillis() - date.getTime()) / 3600000;
        long jCurrentTimeMillis3 = (System.currentTimeMillis() - date.getTime()) / 86400000;
        long j2 = jCurrentTimeMillis3 / 7;
        if (j2 > 0) {
            phrasePut = Phrase.from(context, R.string.intercom_time_week_ago).put("delta", Long.toString(j2));
        } else if (jCurrentTimeMillis3 > 0) {
            phrasePut = Phrase.from(context, R.string.intercom_time_day_ago).put("delta", Long.toString(jCurrentTimeMillis3));
        } else if (jCurrentTimeMillis2 > 0) {
            phrasePut = Phrase.from(context, R.string.intercom_time_hour_ago).put("delta", Long.toString(jCurrentTimeMillis2));
        } else {
            if (jCurrentTimeMillis < 1) {
                return context.getString(R.string.intercom_time_just_now);
            }
            phrasePut = Phrase.from(context, R.string.intercom_time_minute_ago).put("delta", Long.toString(jCurrentTimeMillis));
        }
        return phrasePut.format().toString();
    }

    public static String formatTimeInMillisAsDate(long j, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    public static String formatToUtcTime(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(time);
    }

    private CharSequence getAdminActiveStatus(Date date) {
        Phrase phrasePut;
        long differenceInMinutes = getDifferenceInMinutes(date);
        if (differenceInMinutes > 8640) {
            return this.context.getText(R.string.intercom_active_week_ago);
        }
        if (differenceInMinutes >= 1411) {
            phrasePut = Phrase.from(this.context, R.string.intercom_active_day_ago).put("days", Long.toString((((differenceInMinutes / 60) - 13) / 24) + 1));
        } else if (differenceInMinutes >= 53) {
            phrasePut = Phrase.from(this.context, R.string.intercom_active_hour_ago).put("hours", Long.toString(((differenceInMinutes - 31) / 60) + 1));
        } else if (differenceInMinutes >= 38) {
            phrasePut = Phrase.from(this.context, R.string.intercom_active_minute_ago).put("minutes", Long.toString(45L));
        } else {
            Context context = this.context;
            phrasePut = differenceInMinutes >= 16 ? Phrase.from(context, R.string.intercom_active_minute_ago).put("minutes", Long.toString(30L)) : Phrase.from(context, R.string.intercom_active_15m_ago).put("minutes", Long.toString(15L));
        }
        return phrasePut.format();
    }

    private Date getDateFromTimeStamp(long j) {
        return new Date(j * 1000);
    }

    private long getDifferenceInMinutes(Date date) {
        return (this.timeProvider.currentTimeMillis() - date.getTime()) / 60000;
    }

    public static int getHour(long j) {
        return new Date(j).getHours();
    }

    public static int getMinute(long j) {
        return new Date(j).getMinutes();
    }

    public boolean shouldShowActiveOrAwayState(String str) {
        return str.equals("en");
    }

    public CharSequence getAdminActiveStatus(LastParticipatingAdmin lastParticipatingAdmin, Provider<AppConfig> provider) {
        if (!shouldShowActiveOrAwayState(provider.get().getLocale())) {
            if (lastParticipatingAdmin.getLastActiveAt() <= 0) {
                return BuildConfig.FLAVOR;
            }
            return getAdminActiveStatus(getDateFromTimeStamp(lastParticipatingAdmin.getLastActiveAt()));
        }
        boolean zIsActive = lastParticipatingAdmin.isActive();
        Context context = this.context;
        if (zIsActive) {
            return context.getString(R.string.intercom_active_state);
        }
        return context.getString(R.string.intercom_away_state);
    }
}
