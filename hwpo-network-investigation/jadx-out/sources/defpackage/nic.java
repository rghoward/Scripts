package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nic extends BroadcastReceiver {
    public final lzc a;
    public boolean b;
    public boolean c;

    public nic(lzc lzcVar) {
        a78.g(lzcVar);
        this.a = lzcVar;
    }

    public final void a() {
        lzc lzcVar = this.a;
        lzcVar.m0();
        lzcVar.e().g();
        lzcVar.e().g();
        if (this.b) {
            lzcVar.b().n.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                lzcVar.l.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                lzcVar.b().f.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lzc lzcVar = this.a;
        lzcVar.m0();
        String action = intent.getAction();
        lzcVar.b().n.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            lzcVar.b().i.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        dic dicVar = lzcVar.b;
        lzc.U(dicVar);
        boolean zK = dicVar.k();
        if (this.c != zK) {
            this.c = zK;
            lzcVar.e().p(new lic(this, zK));
        }
    }
}
