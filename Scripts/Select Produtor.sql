SELECT prod.*, ce.* , cd.*, gr.*
FROM 
	produtor as prod
INNER JOIN certificadora AS ce
INNER JOIN grupo as gr
INNER JOIN cidade as cd
ON 
	prod.certificadora_id = ce.id 
AND
    prod.grupo_id = gr.id 
AND
    prod.cidade_id = cd.id 
WHERE prod.id = 1;

-- --------------------------------------------------------------------------
SELECT prod.*, ce.nome as Certificadora , cd.nome as Cidade
FROM 
	produtor as prod
INNER JOIN certificadora AS ce
INNER JOIN cidade as cd
ON 
	prod.certificadora_id = ce.id 
AND
    prod.cidade_id = cd.id 
WHERE prod.id = 1