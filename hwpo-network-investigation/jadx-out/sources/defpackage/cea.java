package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cea implements oh4<no5, Boolean> {
    public final /* synthetic */ d94 t;
    public final /* synthetic */ u56 u;

    public cea(d94 d94Var, u56 u56Var) {
        this.t = d94Var;
        this.u = u56Var;
    }

    @Override // defpackage.oh4
    public final Boolean invoke(no5 no5Var) {
        KeyEvent keyEvent = no5Var.a;
        InputDevice device = keyEvent.getDevice();
        boolean zR = false;
        if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent.getSource() == 33554433) && db7.b(keyEvent) == 2 && keyEvent.getSource() != 257)) {
            boolean zA = gl7.a(19, keyEvent);
            d94 d94Var = this.t;
            if (zA) {
                zR = d94Var.r(5);
            } else if (gl7.a(20, keyEvent)) {
                zR = d94Var.r(6);
            } else if (gl7.a(21, keyEvent)) {
                zR = d94Var.r(3);
            } else if (gl7.a(22, keyEvent)) {
                zR = d94Var.r(4);
            } else if (gl7.a(23, keyEvent)) {
                xv9 xv9Var = this.u.c;
                if (xv9Var != null) {
                    xv9Var.b();
                }
                zR = true;
            }
        }
        return Boolean.valueOf(zR);
    }
}
