package defpackage;

import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ko1 implements el0 {
    public final boolean a;
    public final boolean b;
    public final ld5 c;
    public final vz7 d;
    public final List<v23> e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ko1(int i) {
        this(false, false, new ld5(true, R.string.add_a_comment, R.color.colorPrimary, new lt0(3), null), new vz7(0, false, false, null, null, null, 127), hf3.t);
        ld5.Companion.getClass();
    }

    public static ko1 a(ko1 ko1Var, boolean z, boolean z2, ld5 ld5Var, vz7 vz7Var, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            z = ko1Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = ko1Var.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            ld5Var = ko1Var.c;
        }
        ld5 ld5Var2 = ld5Var;
        if ((i & 8) != 0) {
            vz7Var = ko1Var.d;
        }
        vz7 vz7Var2 = vz7Var;
        List<v23> list = arrayList;
        if ((i & 16) != 0) {
            list = ko1Var.e;
        }
        List<v23> list2 = list;
        ko1Var.getClass();
        ld5Var2.getClass();
        vz7Var2.getClass();
        list2.getClass();
        return new ko1(z3, z4, ld5Var2, vz7Var2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko1)) {
            return false;
        }
        ko1 ko1Var = (ko1) obj;
        return this.a == ko1Var.a && this.b == ko1Var.b && xj5.a(this.c, ko1Var.c) && xj5.a(this.d, ko1Var.d) && xj5.a(this.e, ko1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + uo2.a(Boolean.hashCode(this.a) * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommentsViewState(isProgress=" + this.a + ", isSendButtonEnabled=" + this.b + ", inputFieldViewState=" + this.c + ", placeholderState=" + this.d + ", comments=" + this.e + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ko1(boolean z, boolean z2, ld5 ld5Var, vz7 vz7Var, List<? extends v23> list) {
        this.a = z;
        this.b = z2;
        this.c = ld5Var;
        this.d = vz7Var;
        this.e = list;
    }

    public ko1() {
        this(0);
    }
}
