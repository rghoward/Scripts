package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ey6 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView t;
    public final /* synthetic */ fy6 u;

    public ey6(fy6 fy6Var, MaterialCalendarGridView materialCalendarGridView) {
        this.u = fy6Var;
        this.t = materialCalendarGridView;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.t;
        cy6 cy6VarB = materialCalendarGridView.b();
        if (i < cy6VarB.d() || i > cy6VarB.g()) {
            return;
        }
        rj6.c cVar = this.u.g;
        long jLongValue = materialCalendarGridView.b().getItem(i).longValue();
        rj6 rj6Var = rj6.this;
        if (rj6Var.w.v.p(jLongValue)) {
            rj6Var.v.z(jLongValue);
            Iterator it = rj6Var.t.iterator();
            while (it.hasNext()) {
                ((ai7) it.next()).b(rj6Var.v.u());
            }
            rj6Var.C.getAdapter().a.b();
            RecyclerView recyclerView = rj6Var.B;
            if (recyclerView != null) {
                recyclerView.getAdapter().a.b();
            }
        }
    }
}
