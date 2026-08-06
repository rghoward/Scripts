package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lo3 extends h28 {
    public final bq6.b A;
    public final boolean B;
    public final int v;
    public final String w;
    public final int x;
    public final id4 y;
    public final int z;

    /* JADX WARN: Illegal instructions before constructor call */
    public lo3(int i, Exception exc, int i2, String str, int i3, id4 id4Var, int i4, bq6.b bVar, boolean z) {
        String str2;
        int i5;
        id4 id4Var2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            id4Var2 = id4Var;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            id4Var2 = id4Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            id4Var2 = id4Var;
            sb.append(id4Var2);
            sb.append(", format_supported=");
            String str4 = n6b.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    d43.c();
                    throw null;
                }
                str3 = "YES";
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), exc, i2, i, str2, i5, id4Var2, i4, bVar, SystemClock.elapsedRealtime(), z);
    }

    public final lo3 a(bq6.b bVar) {
        String message = getMessage();
        String str = n6b.a;
        return new lo3(message, getCause(), this.t, this.v, this.w, this.x, this.y, this.z, bVar, this.u, this.B);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo3(String str, Throwable th, int i, int i2, String str2, int i3, id4 id4Var, int i4, bq6.b bVar, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        xl7.g(!z || i2 == 1);
        xl7.g(th != null || i2 == 3);
        this.v = i2;
        this.w = str2;
        this.x = i3;
        this.y = id4Var;
        this.z = i4;
        this.A = bVar;
        this.B = z;
    }

    public lo3(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
