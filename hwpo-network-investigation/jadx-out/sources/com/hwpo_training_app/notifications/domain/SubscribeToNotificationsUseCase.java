package com.hwpo_training_app.notifications.domain;

import com.hwpo_training_app.socket_client.data.network.SocketCommand;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.qj8;
import defpackage.sl5;
import defpackage.tv9;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SubscribeToNotificationsUseCase extends g5b<g2b, g2b> {
    public static final Companion Companion = new Companion(0);
    public final tv9 a;
    public final sl5 b;

    public SubscribeToNotificationsUseCase(tv9 tv9Var, sl5 sl5Var) {
        tv9Var.getClass();
        sl5Var.getClass();
        this.a = tv9Var;
        this.b = sl5Var;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        String strC = this.b.c(SocketCommand.Companion.serializer(), new SocketCommand());
        tv9 tv9Var = this.a;
        tv9Var.getClass();
        qj8 qj8Var = tv9Var.w;
        if (qj8Var != null) {
            qj8Var.send(strC);
            return g2b.a;
        }
        xj5.e("socket");
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
