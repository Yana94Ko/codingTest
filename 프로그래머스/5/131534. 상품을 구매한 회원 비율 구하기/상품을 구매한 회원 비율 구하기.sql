WITH user_2021 AS(
    SELECT * FROM user_info
    WHERE YEAR(joined) = '2021'
)
SELECT
    YEAR(o.sales_date) AS YEAR
    ,MONTH(o.sales_date) AS MONTH
    ,COUNT(DISTINCT u.user_id) AS PUCHASED_USERS
    ,ROUND(COUNT(DISTINCT u.user_id)
         /(
             SELECT COUNT(*) FROM user_2021
         ), 1) AS PUCHASED_RAITO
    FROM user_2021 AS u
    JOIN online_sale AS o
        ON o.user_id = u.user_id
    GROUP BY 
        YEAR, MONTH
    ORDER BY
        YEAR, MONTH;