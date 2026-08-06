package defpackage;

import android.widget.ImageView;
import com.hwpo_training_app.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r67 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ r67(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                return new h77((yz9) obj3, (js1) obj2);
            case 1:
                l4c l4cVar = (l4c) obj3;
                final t72 t72Var = (t72) obj2;
                final Thread threadCurrentThread = Thread.currentThread();
                ((w89) l4cVar).E(new jv9(new oh4() { // from class: dwa
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj4) {
                        mh4 mh4Var = (mh4) obj4;
                        if (threadCurrentThread == Thread.currentThread()) {
                            mh4Var.invoke();
                        } else {
                            oy0.d(t72Var, null, null, new jwa(mh4Var, null), 3);
                        }
                        return g2b.a;
                    }
                }));
                return new lwa(l4cVar);
            default:
                ya yaVar = (ya) obj3;
                hr5 hr5Var = (hr5) obj2;
                ((List) obj).getClass();
                ((ca6) yaVar.u).b.setText(((x60.c) yaVar.t()).b);
                e85.b(hr5Var.b, ((x60.c) yaVar.t()).e, R.drawable.placeholder_video_attachment, true);
                ImageView imageView = hr5Var.e;
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_video_badge);
                hr5Var.c.setVisibility(((x60.c) yaVar.t()).c ? 0 : 8);
                hr5Var.d.setVisibility(((x60.c) yaVar.t()).c ? 0 : 8);
                return g2b.a;
        }
    }
}
