package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.hwpo_training_app.R;
import com.hwpo_training_app.benchmarks.presentation.widget.BenchmarksExpandableLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class if9 implements oh4<List<? extends vn0>, g2b> {
    public final /* synthetic */ bf9 t;

    public if9(bf9 bf9Var) {
        this.t = bf9Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.oh4
    public final g2b invoke(List<? extends vn0> list) {
        int i;
        String strE;
        List<? extends vn0> list2 = list;
        bf9.a aVar = bf9.Companion;
        bf9 bf9Var = this.t;
        BenchmarksExpandableLayout benchmarksExpandableLayout = bf9Var.p().b;
        list2.getClass();
        oq5 oq5Var = benchmarksExpandableLayout.K;
        AppCompatImageView appCompatImageView = oq5Var.c;
        LinearLayoutCompat linearLayoutCompat = oq5Var.b;
        appCompatImageView.setRotation(wn0.a(list2) ? -90.0f : oq5Var.f.a() ? -180.0f : 0.0f);
        boolean z = false;
        Object obj = null;
        if (!list2.isEmpty()) {
            int i2 = 0;
            for (Object obj2 : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ws0.m();
                    throw null;
                }
                vn0 vn0Var = (vn0) obj2;
                View viewInflate = LayoutInflater.from(benchmarksExpandableLayout.getContext()).inflate(R.layout.layout_benchmark_item, linearLayoutCompat, z);
                viewInflate.setClipToOutline(true);
                TextView textView = (TextView) viewInflate.findViewById(R.id.nameText);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.valueText);
                int color = benchmarksExpandableLayout.getContext().getColor(R.color.labelPrimary);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.openPersonalRecordsBtn);
                imageView.setClipToOutline(true);
                xgb.a(imageView, new ho0(benchmarksExpandableLayout, vn0Var, null));
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) viewInflate.findViewById(R.id.recordContainer);
                linearLayoutCompat2.setClipToOutline(true);
                xgb.a(linearLayoutCompat2, new io0(benchmarksExpandableLayout, null));
                textView.setText(vn0Var.u);
                if (!vn0Var.A) {
                    textView2.setTextColor(color);
                    xn0 xn0Var = vn0Var.z;
                    String str = vn0Var.x;
                    if (xn0Var == xn0.u || z2a.w(str)) {
                        strE = wn0.e(vn0Var);
                    } else {
                        strE = benchmarksExpandableLayout.getResources().getString(R.string.value_with_measure_in_parentheses, wn0.e(vn0Var), str);
                        strE.getClass();
                    }
                    textView2.setText(strE);
                }
                ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                if (layoutParams == null) {
                    ac4.c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (i2 == 0 && list2.size() == 1) {
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) benchmarksExpandableLayout.getResources().getDimension(R.dimen.default_margin));
                } else if (i2 != 0) {
                    if (i2 == list2.size() - 1) {
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) benchmarksExpandableLayout.getResources().getDimension(R.dimen.benchmark_top_margin), marginLayoutParams.rightMargin, (int) benchmarksExpandableLayout.getResources().getDimension(R.dimen.default_margin));
                    } else {
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) benchmarksExpandableLayout.getResources().getDimension(R.dimen.benchmark_top_margin), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    }
                }
                viewInflate.setLayoutParams(marginLayoutParams);
                linearLayoutCompat.addView(viewInflate);
                i2 = i3;
                z = false;
            }
        }
        if (wn0.a(list2)) {
            i = R.drawable.ic_benchmarks_empty;
        } else {
            for (Object obj3 : list2) {
                if (((vn0) obj3).A) {
                    obj = obj3;
                    break;
                }
            }
            i = obj != null ? R.drawable.ic_benchmarks_are_not_fulfilled : R.drawable.ic_checked_rounded;
        }
        oq5Var.d.setImageResource(i);
        bf9Var.p().b.setVisibility(!list2.isEmpty() ? 0 : 8);
        return g2b.a;
    }
}
