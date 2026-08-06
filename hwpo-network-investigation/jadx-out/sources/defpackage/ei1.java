package defpackage;

import android.graphics.drawable.ColorDrawable;
import androidx.core.view.insets.a;
import androidx.core.view.insets.b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ei1 extends a {
    public final ColorDrawable f;
    public boolean g;
    public int h;

    public ei1(int i, int i2) {
        super(i);
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f = colorDrawable;
        this.h = 0;
        this.g = true;
        if (i2 != 0) {
            this.h = i2;
            colorDrawable.setColor(i2);
            a.C0012a c0012a = this.b;
            c0012a.e = colorDrawable;
            a.C0012a.InterfaceC0013a interfaceC0013a = c0012a.i;
            if (interfaceC0013a != null) {
                ((b) interfaceC0013a).b.setBackground(colorDrawable);
            }
        }
    }

    @Override // androidx.core.view.insets.a
    public final void a(int i) {
        if (this.g || this.h == i) {
            return;
        }
        this.h = i;
        ColorDrawable colorDrawable = this.f;
        colorDrawable.setColor(i);
        a.C0012a c0012a = this.b;
        c0012a.e = colorDrawable;
        a.C0012a.InterfaceC0013a interfaceC0013a = c0012a.i;
        if (interfaceC0013a != null) {
            ((b) interfaceC0013a).b.setBackground(colorDrawable);
        }
    }
}
