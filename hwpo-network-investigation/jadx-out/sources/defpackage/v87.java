package defpackage;

import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v87 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ v87(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return Boolean.valueOf(((x87) obj).b == ((mz6) obj2));
            default:
                ya yaVar = (ya) obj2;
                ((List) obj).getClass();
                final ja6 ja6Var = (ja6) yaVar.u;
                ja6Var.d.setVisibility(0);
                ImageView imageView = ja6Var.f;
                imageView.setImageDrawable(null);
                ja6Var.c.setImageResource(R.drawable.img_program_without_image_gradient);
                ja6Var.g.setText(((bc8) yaVar.t()).u.u);
                MaterialTextView materialTextView = ja6Var.e;
                materialTextView.setText(((bc8) yaVar.t()).x);
                materialTextView.setVisibility(((bc8) yaVar.t()).x == null ? 8 : 0);
                ja6Var.b.setVisibility(((bc8) yaVar.t()).C ? 0 : 8);
                String str = ((bc8) yaVar.t()).u.v;
                if (str == null) {
                    return g2b.a;
                }
                xgb.f(imageView, str, new mh4() { // from class: cc8
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        ja6 ja6Var2 = ja6Var;
                        ja6Var2.d.setVisibility(8);
                        ja6Var2.c.setImageResource(0);
                        return g2b.a;
                    }
                });
                return g2b.a;
        }
    }
}
