package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.c;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class am implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ am(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a A[LOOP:3: B:29:0x0094->B:31:0x009a, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                cm.U(((cm) obj).getRoot());
                break;
            default:
                o38 o38Var = (o38) obj;
                ValueAnimator valueAnimator = o38Var.s;
                View view = o38Var.l;
                c cVar = o38Var.a;
                ViewGroup viewGroup = o38Var.h;
                ViewGroup viewGroup2 = o38Var.g;
                if (viewGroup2 != null && viewGroup != null) {
                    int width = (cVar.getWidth() - cVar.getPaddingLeft()) - cVar.getPaddingRight();
                    while (true) {
                        if (viewGroup.getChildCount() <= 1) {
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            int iC = o38.c(o38Var.j);
                            int childCount = viewGroup2.getChildCount() - 1;
                            for (int i2 = 0; i2 < childCount; i2++) {
                                iC += o38.c(viewGroup2.getChildAt(i2));
                            }
                            if (iC > width) {
                                if (view != null) {
                                    view.setVisibility(0);
                                    iC += o38.c(view);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (int i3 = 0; i3 < childCount; i3++) {
                                    View childAt = viewGroup2.getChildAt(i3);
                                    iC -= o38.c(childAt);
                                    arrayList.add(childAt);
                                    if (iC <= width) {
                                        if (!arrayList.isEmpty()) {
                                            viewGroup2.removeViews(0, arrayList.size());
                                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                                viewGroup.addView((View) arrayList.get(i4), viewGroup.getChildCount() - 1);
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (!arrayList.isEmpty()) {
                                    viewGroup2.removeViews(0, arrayList.size());
                                    while (i4 < arrayList.size()) {
                                        viewGroup.addView((View) arrayList.get(i4), viewGroup.getChildCount() - 1);
                                    }
                                }
                                break;
                            } else {
                                ViewGroup viewGroup3 = o38Var.i;
                                if (viewGroup3 != null && viewGroup3.getVisibility() == 0 && !valueAnimator.isStarted()) {
                                    o38Var.r.cancel();
                                    valueAnimator.start();
                                    break;
                                }
                            }
                        } else {
                            int childCount2 = viewGroup.getChildCount() - 2;
                            View childAt2 = viewGroup.getChildAt(childCount2);
                            viewGroup.removeViewAt(childCount2);
                            viewGroup2.addView(childAt2, 0);
                        }
                    }
                }
                break;
        }
    }
}
