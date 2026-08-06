package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.hwpo_training_app.R;
import defpackage.dpa;
import defpackage.epa;
import defpackage.wy;
import defpackage.xka;
import defpackage.xz;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    public final wy t;
    public final xz u;
    public boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dpa.a(context);
        this.v = false;
        xka.a(this, getContext());
        wy wyVar = new wy(this);
        this.t = wyVar;
        wyVar.d(attributeSet, i);
        xz xzVar = new xz(this);
        this.u = xzVar;
        xzVar.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.a();
        }
        xz xzVar = this.u;
        if (xzVar != null) {
            xzVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        wy wyVar = this.t;
        if (wyVar != null) {
            return wyVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        wy wyVar = this.t;
        if (wyVar != null) {
            return wyVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        epa epaVar;
        xz xzVar = this.u;
        if (xzVar == null || (epaVar = xzVar.b) == null) {
            return null;
        }
        return epaVar.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        epa epaVar;
        xz xzVar = this.u;
        if (xzVar == null || (epaVar = xzVar.b) == null) {
            return null;
        }
        return epaVar.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.u.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        xz xzVar = this.u;
        if (xzVar != null) {
            xzVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        xz xzVar = this.u;
        if (xzVar != null && drawable != null && !this.v) {
            xzVar.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (xzVar != null) {
            xzVar.a();
            if (this.v) {
                return;
            }
            ImageView imageView = xzVar.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(xzVar.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.v = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.u.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        xz xzVar = this.u;
        if (xzVar != null) {
            xzVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        wy wyVar = this.t;
        if (wyVar != null) {
            wyVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        xz xzVar = this.u;
        if (xzVar != null) {
            if (xzVar.b == null) {
                xzVar.b = new epa();
            }
            epa epaVar = xzVar.b;
            epaVar.a = colorStateList;
            epaVar.d = true;
            xzVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        xz xzVar = this.u;
        if (xzVar != null) {
            if (xzVar.b == null) {
                xzVar.b = new epa();
            }
            epa epaVar = xzVar.b;
            epaVar.b = mode;
            epaVar.c = true;
            xzVar.a();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public AppCompatImageButton(Context context) {
        this(context, null);
    }
}
