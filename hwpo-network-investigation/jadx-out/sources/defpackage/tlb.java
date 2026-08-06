package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tlb extends RecyclerView.f<slb> {
    public final ipb d;
    public List<rlb> e = hf3.t;
    public final RecyclerView.u f;

    public tlb(ipb ipbVar) {
        this.d = ipbVar;
        RecyclerView.u uVar = new RecyclerView.u();
        RecyclerView.u.a aVarA = uVar.a(1);
        aVarA.b = 7;
        ArrayList<RecyclerView.e0> arrayList = aVarA.a;
        while (arrayList.size() > 7) {
            arrayList.remove(arrayList.size() - 1);
        }
        this.f = uVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int f() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final long g(int i) {
        return yk2.y(this.e.get(i).a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void j(RecyclerView.e0 e0Var, int i) {
        slb slbVar = (slb) e0Var;
        slbVar.getClass();
        rlb rlbVar = this.e.get(i);
        rlbVar.getClass();
        slbVar.v.u(rlbVar.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.e0 l(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_week, viewGroup, false);
        viewInflate.getClass();
        return new slb(viewInflate, this.f, this.d);
    }
}
