package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vic {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ zic e;

    public /* synthetic */ vic(zic zicVar, long j) {
        this.e = zicVar;
        a78.d("health_monitor");
        a78.b(j > 0);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j;
    }

    public final void a() {
        zic zicVar = this.e;
        zicVar.g();
        zicVar.a.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = zicVar.k().edit();
        editorEdit.remove(this.b);
        editorEdit.remove(this.c);
        editorEdit.putLong(this.a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
