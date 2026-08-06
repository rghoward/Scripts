package com.hwpo_training_app.notifications.presentation;

import defpackage.ec6;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.pi4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NotificationsFragment$adapter$2$2 extends pi4 implements oh4<Integer, g2b> {
    @Override // defpackage.oh4
    public final g2b invoke(Integer num) {
        int iIntValue = num.intValue();
        NotificationsViewModel notificationsViewModel = (NotificationsViewModel) this.receiver;
        if (!notificationsViewModel.b().b && !notificationsViewModel.b().c && iIntValue + 5 >= notificationsViewModel.b().a.size()) {
            notificationsViewModel.g(ec6.u, false);
        }
        return g2b.a;
    }
}
