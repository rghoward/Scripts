package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import com.hwpo_training_app.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class oib<T extends View, Z> extends wk0<Z> {
    public final T t;
    public final a u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static Integer d;
        public final View a;
        public final ArrayList b = new ArrayList();
        public ViewTreeObserverOnPreDrawListenerC0212a c;

        /* JADX INFO: renamed from: oib$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ViewTreeObserverOnPreDrawListenerC0212a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<a> t;

            public ViewTreeObserverOnPreDrawListenerC0212a(a aVar) {
                this.t = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.t.get();
                if (aVar != null) {
                    ArrayList arrayList = aVar.b;
                    View view = aVar.a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int i = 0;
                        int iA = aVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iA2 = aVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if ((iA <= 0 && iA != Integer.MIN_VALUE) || (iA2 <= 0 && iA2 != Integer.MIN_VALUE)) {
                            return true;
                        }
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj = arrayList2.get(i);
                            i++;
                            ((kr9) obj).e(iA, iA2);
                        }
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(aVar.c);
                        }
                        aVar.c = null;
                        arrayList.clear();
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.a = view;
        }

        public final int a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            View view = this.a;
            if (view.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                ov9.d(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return d.intValue();
        }
    }

    public oib(ImageView imageView) {
        ov9.d(imageView, "Argument must not be null");
        this.t = imageView;
        this.u = new a(imageView);
    }

    @Override // defpackage.j9a
    public final kp8 b() {
        Object tag = this.t.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof kp8) {
                return (kp8) tag;
            }
            z90.a("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // defpackage.j9a
    public final void c(hq9 hq9Var) {
        this.u.b.remove(hq9Var);
    }

    @Override // defpackage.j9a
    public final void d(hq9 hq9Var) throws Throwable {
        a aVar = this.u;
        ArrayList arrayList = aVar.b;
        View view = aVar.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = aVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = aVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            hq9Var.e(iA, iA2);
            return;
        }
        if (!arrayList.contains(hq9Var)) {
            arrayList.add(hq9Var);
        }
        if (aVar.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC0212a viewTreeObserverOnPreDrawListenerC0212a = new a.ViewTreeObserverOnPreDrawListenerC0212a(aVar);
            aVar.c = viewTreeObserverOnPreDrawListenerC0212a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0212a);
        }
    }

    @Override // defpackage.j9a
    public final void e(kp8 kp8Var) {
        this.t.setTag(R.id.glide_custom_view_target_tag, kp8Var);
    }

    @Override // defpackage.j9a
    public void j(Drawable drawable) {
        a aVar = this.u;
        ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.c);
        }
        aVar.c = null;
        aVar.b.clear();
    }

    public final String toString() {
        return "Target for: " + this.t;
    }
}
