# -*- mode: python ; coding: utf-8 -*-


block_cipher = None


a = Analysis(
    ['..\\SimuladorSoftwareRobots\\simulator\\main.py'],
    pathex=['../SimuladorSoftwareRobots/simulator'],
    binaries=[],
    datas=[
        ('../SimuladorSoftwareRobots/buttons', 'buttons'), 
        ('../SimuladorSoftwareRobots/assets', 'assets'),
        ('../SimuladorSoftwareRobots/robot_data.json', '.'),
        ('../SimuladorSoftwareRobots/manual-usuario.pdf', '.')
    ],
    hiddenimports=[],
    hookspath=[],
    hooksconfig={},
    runtime_hooks=[],
    excludes=[],
    win_no_prefer_redirects=False,
    win_private_assemblies=False,
    cipher=block_cipher,
    noarchive=False,
)
pyz = PYZ(a.pure, a.zipped_data, cipher=block_cipher)

exe = EXE(
    pyz,
    a.scripts,
    [],
    exclude_binaries=True,
    name='main',
    debug=False,
    bootloader_ignore_signals=False,
    strip=False,
    upx=True,
    console=True,
    icon='../SimuladorSoftwareRobots/assets/applogo.ico',
    disable_windowed_traceback=False,
    argv_emulation=False,
    target_arch=None,
    codesign_identity=None,
    entitlements_file=None,
)
coll = COLLECT(
    exe,
    a.binaries,
    a.zipfiles,
    a.datas,
    strip=False,
    upx=True,
    upx_exclude=[],
    name='main',
)
