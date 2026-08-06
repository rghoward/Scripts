package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class thc extends cnc {
    public char c;
    public long d;
    public String e;
    public final phc f;
    public final phc g;
    public final phc h;
    public final phc i;
    public final phc j;
    public final phc k;
    public final phc l;
    public final phc m;
    public final phc n;

    public thc(tkc tkcVar) {
        super(tkcVar);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new phc(this, 6, false, false);
        this.g = new phc(this, 6, true, false);
        this.h = new phc(this, 6, false, true);
        this.i = new phc(this, 5, false, false);
        this.j = new phc(this, 5, true, false);
        this.k = new phc(this, 5, false, true);
        this.l = new phc(this, 4, false, false);
        this.m = new phc(this, 3, false, false);
        this.n = new phc(this, 2, false, false);
    }

    public static rhc o(String str) {
        if (str == null) {
            return null;
        }
        return new rhc(str);
    }

    public static String r(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strS = s(obj, z);
        String strS2 = s(obj2, z);
        String strS3 = s(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strS)) {
            sb.append(str2);
            sb.append(strS);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strS2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strS2);
        }
        if (!TextUtils.isEmpty(strS3)) {
            sb.append(str3);
            sb.append(strS3);
        }
        return sb.toString();
    }

    public static String s(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            if (cCharAt == '-') {
                str = "-";
            }
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof rhc) {
                return ((rhc) obj).a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = tkc.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? BuildConfig.FLAVOR : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? BuildConfig.FLAVOR : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    @Override // defpackage.cnc
    public final boolean h() {
        return false;
    }

    public final phc k() {
        return this.f;
    }

    public final phc l() {
        return this.i;
    }

    public final phc m() {
        return this.m;
    }

    public final phc n() {
        return this.n;
    }

    public final void p(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(q(), i)) {
            Log.println(i, q(), r(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        a78.g(str);
        fkc fkcVar = this.a.g;
        if (fkcVar == null) {
            Log.println(6, q(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!fkcVar.b) {
                Log.println(6, q(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            fkcVar.p(new nhc(this, i, str, obj, obj2, obj3));
        }
    }

    public final String q() {
        String str;
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.a.d.a.getClass();
                    this.e = "FA";
                }
                a78.g(this.e);
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
