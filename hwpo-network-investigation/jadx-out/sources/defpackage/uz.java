package defpackage;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uz {
    public final EditText a;
    public final je3 b;

    public uz(EditText editText) {
        this.a = editText;
        this.b = new je3(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        this.b.a.getClass();
        if (keyListener instanceof pe3) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new pe3(keyListener);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, ph8.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final ne3 c(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        je3 je3Var = this.b;
        if (inputConnection == null) {
            je3Var.getClass();
            inputConnection2 = null;
        } else {
            je3.a aVar = je3Var.a;
            aVar.getClass();
            if (!(inputConnection instanceof ne3)) {
                inputConnection = new ne3(aVar.a, inputConnection, editorInfo);
            }
            inputConnection2 = inputConnection;
        }
        return (ne3) inputConnection2;
    }

    public final void d(boolean z) {
        ye3 ye3Var = this.b.a.b;
        if (ye3Var.v != z) {
            if (ye3Var.u != null) {
                d dVarA = d.a();
                ye3.a aVar = ye3Var.u;
                dVarA.getClass();
                b78.d(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = dVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    dVarA.b.remove(aVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            ye3Var.v = z;
            if (z) {
                ye3.a(ye3Var.t, d.a().c());
            }
        }
    }
}
