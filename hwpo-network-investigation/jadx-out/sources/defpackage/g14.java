package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g14 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public g14(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = q2a.a;
        a78.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static g14 a(Context context) {
        n2a n2aVar = new n2a(context);
        String strA = n2aVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new g14(strA, n2aVar.a("google_api_key"), n2aVar.a("firebase_database_url"), n2aVar.a("ga_trackingId"), n2aVar.a("gcm_defaultSenderId"), n2aVar.a("google_storage_bucket"), n2aVar.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g14)) {
            return false;
        }
        g14 g14Var = (g14) obj;
        return te7.a(this.b, g14Var.b) && te7.a(this.a, g14Var.a) && te7.a(this.c, g14Var.c) && te7.a(this.d, g14Var.d) && te7.a(this.e, g14Var.e) && te7.a(this.f, g14Var.f) && te7.a(this.g, g14Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        te7.a aVar = new te7.a(this);
        aVar.a(this.b, "applicationId");
        aVar.a(this.a, "apiKey");
        aVar.a(this.c, "databaseUrl");
        aVar.a(this.e, "gcmSenderId");
        aVar.a(this.f, "storageBucket");
        aVar.a(this.g, "projectId");
        return aVar.toString();
    }
}
