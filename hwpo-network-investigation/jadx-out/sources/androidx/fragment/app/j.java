package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.aa0;
import defpackage.fg4;
import defpackage.gg4;
import defpackage.kh8;
import defpackage.sk0;
import defpackage.ue4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements LayoutInflater.Factory2 {
    public final l t;

    public j(l lVar) {
        this.t = lVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        p pVarH;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        l lVar = this.t;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, lVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kh8.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = f.class.isAssignableFrom(i.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    f fVarD = resourceId != -1 ? lVar.D(resourceId) : null;
                    if (fVarD == null && string != null) {
                        fVarD = lVar.E(string);
                    }
                    if (fVarD == null && id != -1) {
                        fVarD = lVar.D(id);
                    }
                    if (fVarD == null) {
                        fVarD = lVar.J().a(context.getClassLoader(), attributeValue);
                        fVarD.mFromLayout = true;
                        fVarD.mFragmentId = resourceId != 0 ? resourceId : id;
                        fVarD.mContainerId = id;
                        fVarD.mTag = string;
                        fVarD.mInLayout = true;
                        fVarD.mFragmentManager = lVar;
                        ue4<?> ue4Var = lVar.x;
                        fVarD.mHost = ue4Var;
                        fVarD.onInflate((Context) ue4Var.u, attributeSet, fVarD.mSavedFragmentState);
                        pVarH = lVar.a(fVarD);
                        if (l.M(2)) {
                            Log.v("FragmentManager", "Fragment " + fVarD + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fVarD.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fVarD.mInLayout = true;
                        fVarD.mFragmentManager = lVar;
                        ue4<?> ue4Var2 = lVar.x;
                        fVarD.mHost = ue4Var2;
                        fVarD.onInflate((Context) ue4Var2.u, attributeSet, fVarD.mSavedFragmentState);
                        pVarH = lVar.h(fVarD);
                        if (l.M(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fVarD + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    fg4.a aVar = fg4.a;
                    fg4.b(new gg4(fVarD, "Attempting to use <fragment> tag to add fragment " + fVarD + " to container " + viewGroup));
                    fg4.a(fVarD).getClass();
                    fVarD.mContainer = viewGroup;
                    pVarH.k();
                    pVarH.j();
                    View view2 = fVarD.mView;
                    if (view2 == null) {
                        aa0.c(sk0.c("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fVarD.mView.getTag() == null) {
                        fVarD.mView.setTag(string);
                    }
                    fVarD.mView.addOnAttachStateChangeListener(new a(pVarH));
                    return fVarD.mView;
                }
            }
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ p t;

        public a(p pVar) {
            this.t = pVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            p pVar = this.t;
            f fVar = pVar.c;
            pVar.k();
            u.i((ViewGroup) fVar.mView.getParent(), j.this.t).h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
