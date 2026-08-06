package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cl0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ cl0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        Context context;
        yi9 yi9Var;
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                gm3 gm3Var = (gm3) obj;
                ho5<Object>[] ho5VarArr = dl0.w;
                gm3Var.getClass();
                ((oh4) obj2).invoke(gm3Var);
                break;
            case 1:
                t61 t61Var = (t61) obj2;
                gm3 gm3Var2 = (gm3) obj;
                t61.a aVar = t61.Companion;
                gm3Var2.getClass();
                if (gm3Var2 instanceof p61) {
                    Context context2 = t61Var.getContext();
                    if (context2 != null) {
                        yz1.a(context2, null);
                    }
                } else if (gm3Var2 instanceof q61) {
                    t61Var.m(((q61) gm3Var2).b);
                } else if (gm3Var2 instanceof atb) {
                    btb.a aVar2 = btb.Companion;
                    String str = ((atb) gm3Var2).b;
                    aVar2.getClass();
                    hk0.l(t61Var, btb.a.a(str));
                } else if ((gm3Var2 instanceof o61) && (context = t61Var.getContext()) != null) {
                    o61 o61Var = (o61) gm3Var2;
                    File file = o61Var.b;
                    String str2 = o61Var.c;
                    String str3 = o61Var.d;
                    file.getClass();
                    str2.getClass();
                    str3.getClass();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.getUriForFile(context, str3.concat(".fileprovider"), file), str2);
                    try {
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        t61.a aVar3 = t61.Companion;
                        Toast.makeText(t61Var.requireContext(), t61Var.getResources().getString(R.string.file_can_not_be_open), 0).show();
                        g2b g2bVar = g2b.a;
                    }
                }
                break;
            default:
                hi9 hi9Var = (hi9) obj2;
                gm3 gm3Var3 = (gm3) obj;
                hi9.a aVar4 = hi9.Companion;
                gm3Var3.getClass();
                if (gm3Var3 instanceof wh9) {
                    hi9Var.m(((wh9) gm3Var3).b);
                } else if (gm3Var3 instanceof uh9) {
                    Context context3 = hi9Var.getContext();
                    if (context3 != null) {
                        yz1.a(context3, ((uh9) gm3Var3).b);
                    }
                } else if (gm3Var3 instanceof atb) {
                    btb.a aVar5 = btb.Companion;
                    String str4 = ((atb) gm3Var3).b;
                    aVar5.getClass();
                    hk0.l(hi9Var, btb.a.a(str4));
                } else if (gm3Var3 instanceof zh9) {
                    whb parentFragment = hi9Var.getParentFragment();
                    yi9Var = parentFragment instanceof yi9 ? (yi9) parentFragment : null;
                    if (yi9Var != null) {
                        yi9Var.d();
                    }
                } else if (gm3Var3 instanceof yh9) {
                    whb parentFragment2 = hi9Var.getParentFragment();
                    yi9Var = parentFragment2 instanceof yi9 ? (yi9) parentFragment2 : null;
                    if (yi9Var != null) {
                        yi9Var.f();
                    }
                } else if (gm3Var3 instanceof ai9) {
                    whb parentFragment3 = hi9Var.getParentFragment();
                    yi9Var = parentFragment3 instanceof yi9 ? (yi9) parentFragment3 : null;
                    if (yi9Var != null) {
                        ai9 ai9Var = (ai9) gm3Var3;
                        yi9Var.b(ai9Var.b, ai9Var.c);
                    }
                } else if (gm3Var3 instanceof vh9) {
                    RecyclerView recyclerView = hi9Var.p().g;
                    recyclerView.setLayoutAnimationListener((hi9.k) hi9Var.D.getValue());
                    recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(hi9Var.requireContext(), ((vh9) gm3Var3).b));
                    recyclerView.scheduleLayoutAnimation();
                } else if (gm3Var3 instanceof xh9) {
                    sc1.a aVar6 = sc1.Companion;
                    ArrayList arrayList = ((xh9) gm3Var3).b;
                    aVar6.getClass();
                    sc1 sc1Var = new sc1();
                    sc1Var.setArguments(uy0.c(new js7("com.hwpo_training_app.client.ui.sessions.details.ChoosePlanOptionsBottomSheetDialog.OPTIONS_ARG_KEY", arrayList)));
                    sc1Var.K = new ji9(1, hi9Var.q(), lj9.class, "onPlanOptionChanged", "onPlanOptionChanged(Lcom/hwpo_training_app/core/presentation/entity/program/PlanOptionUiEntity;)V", 0);
                    hk0.l(hi9Var, sc1Var);
                }
                break;
        }
        return g2b.a;
    }
}
