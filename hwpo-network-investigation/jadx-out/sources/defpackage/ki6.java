package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ki6 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n03.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final String a(Integer num, bu8 bu8Var) {
        bu8Var.getClass();
        if (num == null) {
            return BuildConfig.FLAVOR;
        }
        boolean z = num.intValue() > 0;
        if (z) {
            return bu8Var.b(R.string.percent_format_positive, num);
        }
        if (!z) {
            return bu8Var.b(R.string.percent_format, num);
        }
        u.b();
        return null;
    }

    public static final String b(long j, bu8 bu8Var) {
        bu8Var.getClass();
        long j2 = j / 3600;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long seconds = timeUnit.toSeconds(j2);
        long minutes = timeUnit.toMinutes(j2);
        long j3 = j - seconds;
        long j4 = j3 / 60;
        return bu8Var.b(R.string.m_s_format, Long.valueOf(minutes + j4), Long.valueOf(j3 - TimeUnit.MINUTES.toSeconds(j4)));
    }

    public static final int c(n03 n03Var, bu8 bu8Var) {
        bu8Var.getClass();
        int i = n03Var == null ? -1 : a.a[n03Var.ordinal()];
        if (i == -1) {
            return bu8Var.a(android.R.color.transparent);
        }
        if (i == 1) {
            return bu8Var.a(R.color.bg_percentage_positive);
        }
        if (i == 2) {
            return bu8Var.a(R.color.bg_percentage_negative);
        }
        if (i == 3) {
            return bu8Var.a(R.color.bg_percentage_neutral);
        }
        u.b();
        return 0;
    }

    public static final int d(n03 n03Var, bu8 bu8Var) {
        bu8Var.getClass();
        int i = n03Var == null ? -1 : a.a[n03Var.ordinal()];
        if (i == -1) {
            return bu8Var.a(android.R.color.transparent);
        }
        if (i == 1) {
            return bu8Var.a(R.color.text_percentage_positive);
        }
        if (i == 2) {
            return bu8Var.a(R.color.text_percentage_negative);
        }
        if (i == 3) {
            return bu8Var.a(R.color.text_percentage_neutral);
        }
        u.b();
        return 0;
    }
}
