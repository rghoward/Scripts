package defpackage;

import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ryc extends v8c {
    public final /* synthetic */ lzc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryc(lzc lzcVar, enc encVar) {
        super(encVar);
        this.e = lzcVar;
    }

    @Override // defpackage.v8c
    public final void a() {
        lzc lzcVar = this.e;
        lzcVar.e().g();
        String str = (String) lzcVar.q.pollFirst();
        if (str != null) {
            lzcVar.c().getClass();
            lzcVar.I = SystemClock.elapsedRealtime();
            lzcVar.b().n.b(str, "Sending trigger URI notification to app");
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            lzc.S(lzcVar.l.a, intent);
        }
        lzcVar.H();
    }
}
