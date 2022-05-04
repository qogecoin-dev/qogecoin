package org.qogecoincore.qt;

import android.os.Bundle;
import android.system.ErrnoException;
import android.system.Os;

import org.qtproject.qt5.android.bindings.QtActivity;

import java.io.File;

public class QogecoinQtActivity extends QtActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        final File qogecoinDir = new File(getFilesDir().getAbsolutePath() + "/.qogecoin");
        if (!qogecoinDir.exists()) {
            qogecoinDir.mkdir();
        }

        super.onCreate(savedInstanceState);
    }
}
