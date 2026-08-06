package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ch6 implements el0 {
    public final int a;
    public final int b;

    public /* synthetic */ ch6(int i, int i2, int i3) {
        this((i2 & 1) != 0 ? R.id.calendar : i, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch6)) {
            return false;
        }
        ch6 ch6Var = (ch6) obj;
        return this.a == ch6Var.a && this.b == ch6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return a30.b("MainTabsViewState(selectedTab=", ", unreadNotificationsCount=", ")", this.a, this.b);
    }

    public ch6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ch6() {
        int i = 0;
        this(i, 3, i);
    }
}
