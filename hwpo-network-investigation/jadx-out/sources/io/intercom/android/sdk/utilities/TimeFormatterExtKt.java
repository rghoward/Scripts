package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.os.Build;
import android.text.format.DateFormat;
import com.intercom.twig.BuildConfig;
import defpackage.w2a;
import io.intercom.android.sdk.R;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TimeFormatterExtKt {
    public static final String formattedDateForDayDivider(long j, Context context) {
        context.getClass();
        if (j <= 0) {
            return BuildConfig.FLAVOR;
        }
        Date date = new Date(j * 1000);
        Locale localeCompat = UtilsKt.getLocaleCompat(context);
        String str = new SimpleDateFormat(DateFormat.getBestDateTimePattern(localeCompat, "MMMM d"), localeCompat).format(date);
        str.getClass();
        return str;
    }

    public static final String formattedDateFromLong(long j, Context context) {
        context.getClass();
        return j <= 0 ? BuildConfig.FLAVOR : getFormattedTime(context, new Date(j * 1000));
    }

    private static final long getDifferenceInDays(Date date) {
        return (System.currentTimeMillis() - date.getTime()) / 86400000;
    }

    private static final long getDifferenceInHours(Date date) {
        return (System.currentTimeMillis() - date.getTime()) / 3600000;
    }

    private static final long getDifferenceInMinutes(Date date) {
        return (System.currentTimeMillis() - date.getTime()) / 60000;
    }

    private static final String getFormattedTime(Context context, Date date) {
        long differenceInMinutes = getDifferenceInMinutes(date);
        long differenceInHours = getDifferenceInHours(date);
        long differenceInDays = getDifferenceInDays(date);
        long j = differenceInDays / 7;
        if (j > 0) {
            return Phrase.from(context, R.string.intercom_time_week_ago).put("delta", String.valueOf(j)).format().toString();
        }
        if (differenceInDays > 0) {
            return Phrase.from(context, R.string.intercom_time_day_ago).put("delta", String.valueOf(differenceInDays)).format().toString();
        }
        if (differenceInHours > 0) {
            return Phrase.from(context, R.string.intercom_time_hour_ago).put("delta", String.valueOf(differenceInHours)).format().toString();
        }
        return differenceInMinutes >= 1 ? Phrase.from(context, R.string.intercom_time_minute_ago).put("delta", String.valueOf(differenceInMinutes)).format().toString() : context.getText(R.string.intercom_time_just_now).toString();
    }

    public static final String toHourOfDay(long j) {
        return Build.VERSION.SDK_INT >= 26 ? toHourOfDayApi26$default(j, null, 1, null) : toHourOfDayPreApi26$default(j, null, 1, null);
    }

    public static final String toHourOfDayApi26(long j, ZoneId zoneId) {
        zoneId.getClass();
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j * 1000), zoneId);
        String str = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH).format(zonedDateTimeOfInstant);
        if (zonedDateTimeOfInstant.getHour() == 0) {
            str.getClass();
            return w2a.l(str, "12:00", "00:00");
        }
        str.getClass();
        return str;
    }

    public static /* synthetic */ String toHourOfDayApi26$default(long j, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return toHourOfDayApi26(j, zoneId);
    }

    public static final String toHourOfDayPreApi26(long j, TimeZone timeZone) {
        timeZone.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(timeZone);
        long j2 = j * 1000;
        String str = simpleDateFormat.format(Long.valueOf(j2));
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j2);
        if (calendar.get(11) == 0) {
            str.getClass();
            return w2a.l(str, "12:00", "00:00");
        }
        str.getClass();
        return str;
    }

    public static /* synthetic */ String toHourOfDayPreApi26$default(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return toHourOfDayPreApi26(j, timeZone);
    }

    public static final String toISOFormat(long j) {
        return Build.VERSION.SDK_INT >= 26 ? toISOFormatApi26(j) : toISOFormatPreApi26(j);
    }

    public static final String toISOFormatApi26(long j) {
        String str = DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(j * 1000));
        str.getClass();
        return str;
    }

    public static final String toISOFormatPreApi26(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(Long.valueOf(j * 1000));
        str.getClass();
        return str;
    }
}
