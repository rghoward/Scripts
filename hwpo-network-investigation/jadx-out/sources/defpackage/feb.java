package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class feb extends RecyclerView.n {
    public final Drawable a;
    public final int b;
    public final int c;

    public feb(Drawable drawable, int i, int i2) {
        this.a = drawable;
        this.b = i;
        this.c = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        canvas.getClass();
        a0Var.getClass();
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null && itemAnimator.k()) {
            return;
        }
        int paddingLeft = recyclerView.getPaddingLeft() + this.b;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.c;
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.getClass();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) layoutParams)).bottomMargin;
            Drawable drawable = this.a;
            drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
            drawable.draw(canvas);
            i = i2;
        }
    }
}
