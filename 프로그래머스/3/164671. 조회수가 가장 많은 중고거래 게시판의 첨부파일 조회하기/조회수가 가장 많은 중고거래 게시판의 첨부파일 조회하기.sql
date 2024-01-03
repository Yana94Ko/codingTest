-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/',tBoard.board_id,'/',tFile.file_id, tFile.file_name, tFile.file_ext) AS 'FILE_PATH'
    FROM used_goods_file tFile
    JOIN used_goods_board tBoard
    ON tFile.board_id = tBoard.board_id
    WHERE tBoard.views = (
        SELECT MAX(views)
            FROM used_goods_board
    )
    ORDER BY tFile.file_id DESC;