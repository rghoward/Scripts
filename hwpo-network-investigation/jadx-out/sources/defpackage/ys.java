package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ys implements lgb {
    public final ViewConfiguration a;

    public ys(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.lgb
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.lgb
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.lgb
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return zs.b(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.lgb
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.lgb
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.lgb
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return zs.a(this.a);
        }
        return 16.0f;
    }
}
