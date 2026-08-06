package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pe8 extends s21 implements ho5 {
    public final boolean t;

    public pe8(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.t = (i & 2) == 2;
    }

    @Override // defpackage.s21
    public final vn5 compute() {
        return this.t ? this : super.compute();
    }

    @Override // defpackage.s21
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ho5 getReflected() {
        if (!this.t) {
            return (ho5) super.getReflected();
        }
        ru3.f("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pe8) {
            pe8 pe8Var = (pe8) obj;
            return getOwner().equals(pe8Var.getOwner()) && getName().equals(pe8Var.getName()) && getSignature().equals(pe8Var.getSignature()) && xj5.a(getBoundReceiver(), pe8Var.getBoundReceiver());
        }
        if (obj instanceof ho5) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        vn5 vn5VarCompute = compute();
        if (vn5VarCompute != this) {
            return vn5VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
