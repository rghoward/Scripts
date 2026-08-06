package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wu0 implements nva {
    public static String a(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    @Override // defpackage.nva
    public Object apply(Object obj) {
        ng9 ng9Var = (ng9) obj;
        og9.a.getClass();
        String strA = og9.b.a(ng9Var);
        strA.getClass();
        ng9Var.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strA.getBytes(ua1.b);
        bytes.getClass();
        return bytes;
    }
}
